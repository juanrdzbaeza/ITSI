<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<xsl:value-of select="check_spelling/misspelling/suggestions/suggestion" />
	</xsl:template>
</xsl:stylesheet>
