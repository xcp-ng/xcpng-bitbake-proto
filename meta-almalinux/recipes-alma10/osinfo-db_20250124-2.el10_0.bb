
inherit dnf-bridge

PN = "osinfo-db"
PE = "0"
PV = "20250124"
PR = "2.el10_0"
PACKAGES = "osinfo-db"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/osinfo-db-20250124-2.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_osinfo-db = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osinfo-db-20250124-2.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_osinfo-db}"
RDEPENDS:osinfo-db = " \
 hwdata \
"
