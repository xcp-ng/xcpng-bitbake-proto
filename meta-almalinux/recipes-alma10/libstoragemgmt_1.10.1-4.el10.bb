
PN = "libstoragemgmt"
PE = "0"
PV = "1.10.1"
PR = "4.el10"
PACKAGES = "libstoragemgmt libstoragemgmt-arcconf-plugin libstoragemgmt-hpsa-plugin libstoragemgmt-local-plugin libstoragemgmt-megaraid-plugin libstoragemgmt-nfs-plugin libstoragemgmt-targetd-plugin libstoragemgmt-udev python3-libstoragemgmt libstoragemgmt-devel"


URI_libstoragemgmt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-1.10.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstoragemgmt = "
 python3
 sg3_utils-libs
 systemd
 systemd-libs
 ledmon-libs
 libgcc
 python3-libstoragemgmt
 sqlite-libs
 libstdc++
 bash
 glib2
 libconfig
 glibc
"

URI_libstoragemgmt-arcconf-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-arcconf-plugin-1.10.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libstoragemgmt-arcconf-plugin = "
 python3-libstoragemgmt
 bash
 python3
"

URI_libstoragemgmt-hpsa-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-hpsa-plugin-1.10.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libstoragemgmt-hpsa-plugin = "
 python3-libstoragemgmt
 bash
 python3
"

URI_libstoragemgmt-local-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-local-plugin-1.10.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libstoragemgmt-local-plugin = "
 python3
 python3-libstoragemgmt
 libstoragemgmt-arcconf-plugin
 libstoragemgmt-hpsa-plugin
 bash
"

URI_libstoragemgmt-megaraid-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-megaraid-plugin-1.10.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libstoragemgmt-megaraid-plugin = "
 python3-libstoragemgmt
 bash
 python3
"

URI_libstoragemgmt-nfs-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-nfs-plugin-1.10.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstoragemgmt-nfs-plugin = "
 python3
 nfs-utils
 sg3_utils-libs
 systemd-libs
 ledmon-libs
 python3-libstoragemgmt
 libstoragemgmt
 bash
 glib2
 glibc
"

URI_libstoragemgmt-targetd-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-targetd-plugin-1.10.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libstoragemgmt-targetd-plugin = "
 python3-libstoragemgmt
 bash
 python3
"

URI_libstoragemgmt-udev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-udev-1.10.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstoragemgmt-udev = "
 glibc
"

URI_python3-libstoragemgmt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libstoragemgmt-1.10.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libstoragemgmt = "
 python3
 sg3_utils-libs
 systemd-libs
 ledmon-libs
 libstoragemgmt
 python3-six
 glib2
 glibc
"

URI_libstoragemgmt-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libstoragemgmt-devel-1.10.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstoragemgmt-devel = "
 libstoragemgmt
 pkgconf-pkg-config
"
