
PN = "libpwquality"
PE = "0"
PV = "1.4.5"
PR = "12.el10"
PACKAGES = "libpwquality python3-pwquality libpwquality-devel"


URI_libpwquality = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpwquality-1.4.5-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpwquality = "
 glibc
 pam-libs
 cracklib
 cracklib-dicts
"

URI_python3-pwquality = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pwquality-1.4.5-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pwquality = "
 glibc
 libpwquality
 python3
"

URI_libpwquality-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libpwquality-devel-1.4.5-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpwquality-devel = "
 libpwquality
 pkgconf-pkg-config
"
