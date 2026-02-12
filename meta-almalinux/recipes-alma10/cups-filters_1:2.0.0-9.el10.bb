
inherit dnf-bridge

PN = "cups-filters"
PE = "1"
PV = "2.0.0"
PR = "9.el10"
PACKAGES = "cups-filters cups-filters-driverless"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/cups-filters-2.0.0-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cups-filters = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cups-filters-2.0.0-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cups-filters}"
RDEPENDS:cups-filters = " \
 cups-filesystem \
 cups-libs \
 bash \
 libcupsfilters \
 glibc \
 libppd \
"

URI_cups-filters-driverless = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cups-filters-driverless-2.0.0-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cups-filters-driverless}"
RDEPENDS:cups-filters-driverless = " \
 cups-ipptool \
 cups-filesystem \
 cups-libs \
 avahi \
 bash \
 libcupsfilters \
 glibc \
 libppd \
"
