<ul>
<#list type as p>
<#if p.id=s>
这是最后一个对象
</#if>
这是第${p_index+1}个对象============${p.id}--${p.tname}
<#if p_has_next!="true">
这是最后一个对象
</#if>
</#list>
</ul>