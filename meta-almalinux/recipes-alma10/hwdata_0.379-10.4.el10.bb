
inherit dnf-bridge

PN = "hwdata"
PE = "0"
PV = "0.379"
PR = "10.4.el10"
PACKAGES = "hwdata hwdata-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/hwdata-0.379-10.4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hwdata = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/hwdata-0.379-10.4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hwdata}"
RDEPENDS:hwdata = ""

URI_hwdata-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/hwdata-devel-0.379-10.4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hwdata-devel}"
RDEPENDS:hwdata-devel = " \
 pkgconf-pkg-config \
 hwdata \
"
