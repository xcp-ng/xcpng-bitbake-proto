
PN = "kea"
PE = "0"
PV = "2.6.3"
PR = "1.el10_0"
PACKAGES = "kea kea-libs kea-doc kea-hooks kea-keama kea-devel"


URI_kea = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kea-2.6.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kea = "
 python3
 shadow-utils
 systemd
 util-linux
 libgcc
 openssl-libs
 libstdc++
 bash
 kea-libs
 glibc
 coreutils
"

URI_kea-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kea-libs-2.6.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kea-libs = "
 libpq
 openssl-libs
 libgcc
 libstdc++
 mariadb-connector-c
 glibc
 boost-system
 log4cplus
"

URI_kea-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kea-doc-2.6.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:kea-doc = ""

URI_kea-hooks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kea-hooks-2.6.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kea-hooks = "
 libpq
 openssl-libs
 libgcc
 mariadb-connector-c
 kea-libs
 glibc
 boost-system
 log4cplus
"

URI_kea-keama = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/kea-keama-2.6.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kea-keama = "
 glibc
"

URI_kea-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kea-devel-2.6.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kea-devel = "
 openssl-devel
 pkgconf-pkg-config
 kea-libs
 boost-devel
"
