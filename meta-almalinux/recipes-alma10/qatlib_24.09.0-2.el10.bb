
PN = "qatlib"
PE = "0"
PV = "24.09.0"
PR = "2.el10"
PACKAGES = "qatlib qatlib-service qatlib-devel qatlib-tests"


URI_qatlib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qatlib-24.09.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatlib = "
 shadow-utils
 numactl-libs
 openssl-libs
 bash
 glibc
"

URI_qatlib-service = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qatlib-service-24.09.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatlib-service = "
 qatlib
 systemd
 numactl-libs
 pciutils
 bash
 glibc
"

URI_qatlib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qatlib-devel-24.09.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatlib-devel = "
 qatlib-devel
 openssl-devel
 qatlib
 pkgconf-pkg-config
"

URI_qatlib-tests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qatlib-tests-24.09.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatlib-tests = "
 glibc
 openssl-libs
 zlib-ng-compat
 qatlib
"
