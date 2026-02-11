
PN = "asciidoc"
PE = "0"
PV = "10.2.0"
PR = "12.el10"
PACKAGES = "asciidoc asciidoc-doc asciidoc-latex"


URI_asciidoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/asciidoc-10.2.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:asciidoc = "/usr/bin/python3 ( ) python3 ( ) libxslt ( ) graphviz ( ) docbook-style-xsl ( ) source-highlight ( ) python(abi) ( =  3.12)"
RPROVIDES:asciidoc = "asciidoc ( =  10.2.0-12.el10) python3.12dist(asciidoc) ( =  10.2) python3dist(asciidoc) ( =  10.2)"

URI_asciidoc-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/asciidoc-doc-10.2.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:asciidoc-doc = "asciidoc ( =  10.2.0-12.el10)"
RPROVIDES:asciidoc-doc = "asciidoc-doc ( =  10.2.0-12.el10)"

URI_asciidoc-latex = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/asciidoc-latex-10.2.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:asciidoc-latex = "dblatex ( ) texlive-dvipng-bin ( ) asciidoc ( =  10.2.0-12.el10)"
RPROVIDES:asciidoc-latex = "asciidoc-latex ( =  10.2.0-12.el10)"
