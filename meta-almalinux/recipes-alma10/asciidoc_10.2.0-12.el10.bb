
inherit dnf-bridge

PN = "asciidoc"
PE = "0"
PV = "10.2.0"
PR = "12.el10"
PACKAGES = "asciidoc asciidoc-doc asciidoc-latex"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/asciidoc-10.2.0-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_asciidoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/asciidoc-10.2.0-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_asciidoc}"
RDEPENDS:asciidoc = " \
 python3 \
 source-highlight \
 libxslt \
 docbook-style-xsl \
 graphviz \
"

URI_asciidoc-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/asciidoc-doc-10.2.0-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_asciidoc-doc}"
RDEPENDS:asciidoc-doc = " \
 asciidoc \
"

URI_asciidoc-latex = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/asciidoc-latex-10.2.0-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_asciidoc-latex}"
RDEPENDS:asciidoc-latex = " \
 texlive-dvipng \
 dblatex \
 asciidoc \
"
