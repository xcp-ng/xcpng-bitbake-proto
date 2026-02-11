
PN = "asciidoc"
PE = "0"
PV = "10.2.0"
PR = "12.el10"
PACKAGES = "asciidoc asciidoc-doc asciidoc-latex"


URI_asciidoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/asciidoc-10.2.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:asciidoc = "
 python3
 source-highlight
 libxslt
 docbook-style-xsl
 graphviz
"

URI_asciidoc-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/asciidoc-doc-10.2.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:asciidoc-doc = "
 asciidoc
"

URI_asciidoc-latex = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/asciidoc-latex-10.2.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:asciidoc-latex = "
 texlive-dvipng
 dblatex
 asciidoc
"
