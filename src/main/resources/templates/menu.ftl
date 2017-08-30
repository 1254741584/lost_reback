<ul>
<#list type as p>
<#if index==p.tid>
</#if>
<li><a href="findlost/${p.tid}">${p.tname} </a></li>
</#list>
</ul>