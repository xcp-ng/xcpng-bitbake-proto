
PN = "gtk-doc"
PE = "0"
PV = "1.33.2"
PR = "12.el10"
PACKAGES = "gtk-doc"


URI_gtk-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtk-doc-1.33.2-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk-doc = "
 python3
 docbook-utils
 cmake-filesystem
 libxslt
 pkgconf-pkg-config
 docbook-style-xsl
 python3-pygments
 bash
 python3-lxml
"
