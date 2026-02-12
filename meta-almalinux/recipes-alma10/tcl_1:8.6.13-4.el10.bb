
inherit dnf-bridge

PN = "tcl"
PE = "1"
PV = "8.6.13"
PR = "4.el10"
PACKAGES = "tcl tcl-devel tcl-doc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/tcl-8.6.13-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tcl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tcl-8.6.13-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tcl}"
RDEPENDS:tcl = " \
 glibc \
 zlib-ng-compat \
"

URI_tcl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tcl-devel-8.6.13-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tcl-devel}"
RDEPENDS:tcl-devel = " \
 zlib-ng-compat-devel \
 pkgconf-pkg-config \
 tcl \
"

URI_tcl-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tcl-doc-8.6.13-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tcl-doc}"
RDEPENDS:tcl-doc = " \
 tcl \
"
