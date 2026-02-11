
PN = "libwacom"
PE = "0"
PV = "2.14.0"
PR = "3.el10_0"
PACKAGES = "libwacom libwacom-data libwacom-devel libwacom-utils"


URI_libwacom = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwacom-2.14.0-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwacom = "
 python3
 libwacom-data
 libgudev
 libevdev
 glib2
 glibc
"

URI_libwacom-data = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwacom-data-2.14.0-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:libwacom-data = ""

URI_libwacom-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libwacom-devel-2.14.0-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwacom-devel = "
 glib2-devel
 libwacom
 pkgconf-pkg-config
 libevdev-devel
 libgudev-devel
"

URI_libwacom-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libwacom-utils-2.14.0-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwacom-utils = "
 python3
 python3-pyudev
 python3-libevdev
 libwacom
 glib2
 glibc
"
