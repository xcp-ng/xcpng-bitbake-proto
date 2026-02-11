
PN = "libcap-ng"
PE = "0"
PV = "0.8.4"
PR = "6.el10"
PACKAGES = "libcap-ng libcap-ng-utils libcap-ng-devel libcap-ng-python3"


URI_libcap-ng = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcap-ng-0.8.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-ng = " \
 glibc \
"

URI_libcap-ng-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcap-ng-utils-0.8.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-ng-utils = " \
 glibc \
 libcap-ng \
"

URI_libcap-ng-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcap-ng-devel-0.8.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-ng-devel = " \
 kernel-headers \
 pkgconf-pkg-config \
 libcap-ng \
"

URI_libcap-ng-python3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcap-ng-python3-0.8.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcap-ng-python3 = " \
 glibc \
 python3 \
 libcap-ng \
"
