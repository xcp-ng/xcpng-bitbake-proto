
PN = "xfsprogs"
PE = "0"
PV = "6.11.0"
PR = "1.el10"
PACKAGES = "xfsprogs xfsprogs-devel xfsprogs-xfs_scrub"


URI_xfsprogs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/xfsprogs-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xfsprogs = "
 libuuid
 userspace-rcu
 libblkid
 bash
 inih
 glibc
 libedit
"

URI_xfsprogs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xfsprogs-devel-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xfsprogs-devel = "
 libuuid-devel
 xfsprogs
"

URI_xfsprogs-xfs_scrub = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xfsprogs-xfs_scrub-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xfsprogs-xfs_scrub = "
 python3
 userspace-rcu
 util-linux
 bash
 glibc
 libicu
 xfsprogs
"
