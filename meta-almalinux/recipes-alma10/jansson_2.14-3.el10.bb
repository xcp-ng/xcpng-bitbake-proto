
inherit dnf-bridge

PN = "jansson"
PE = "0"
PV = "2.14"
PR = "3.el10"
PACKAGES = "jansson jansson-devel jansson-devel-doc"


URI_jansson = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/jansson-2.14-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jansson = " \
 glibc \
"

URI_jansson-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jansson-devel-2.14-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jansson-devel = " \
 jansson \
 pkgconf-pkg-config \
"

URI_jansson-devel-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jansson-devel-doc-2.14-3.el10.noarch.rpm;unpack=0"
RDEPENDS:jansson-devel-doc = ""
