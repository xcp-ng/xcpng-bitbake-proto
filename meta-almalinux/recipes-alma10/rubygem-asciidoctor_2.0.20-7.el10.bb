
inherit dnf-bridge

PN = "rubygem-asciidoctor"
PE = "0"
PV = "2.0.20"
PR = "7.el10"
PACKAGES = "rubygem-asciidoctor rubygem-asciidoctor-doc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/rubygem-asciidoctor-2.0.20-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rubygem-asciidoctor = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-asciidoctor-2.0.20-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-asciidoctor}"
RDEPENDS:rubygem-asciidoctor = " \
 rubygems \
 ruby \
"

URI_rubygem-asciidoctor-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-asciidoctor-doc-2.0.20-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-asciidoctor-doc}"
RDEPENDS:rubygem-asciidoctor-doc = " \
 rubygem-asciidoctor \
"
