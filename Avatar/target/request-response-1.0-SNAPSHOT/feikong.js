function notNull(id){
    var flag = true;
    var data = jQuery("#"+id+" input[notNull]");
    data.each(function() {
        if ($(this).val() == "") {
            Ext.Msg.alert('提示', $(this).attr('notNull') + "不能为空!");
            $(this).focus();
            flag = false;
            return flag;
        }
        if ($(this).attr("type") == "checkbox") {
            var name = $(this).attr("name");
            if ($("input:checked[:checkbox][name='" + name + "']").length == 0) {
                Ext.Msg.alert('提示', $(this).attr('notNull') + "不能为空!");
                flag = false;
                return flag;
            }
        }
    })

}