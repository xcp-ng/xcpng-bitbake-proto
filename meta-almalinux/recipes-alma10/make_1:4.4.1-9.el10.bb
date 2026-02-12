
inherit dnf-bridge

PN = "make"
PE = "1"
PV = "4.4.1"
PR = "9.el10"
PACKAGES = "make make-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/make-4.4.1-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_make = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/make-4.4.1-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_make}"
RDEPENDS:make = " \
 glibc \
"

URI_make-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/make-devel-4.4.1-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_make-devel}"
RDEPENDS:make-devel = ""
