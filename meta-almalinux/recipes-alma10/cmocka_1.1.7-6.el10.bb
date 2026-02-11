
PN = "cmocka"
PE = "0"
PV = "1.1.7"
PR = "6.el10"
PACKAGES = "libcmocka libcmocka-devel cmocka-doc"


URI_libcmocka = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcmocka-1.1.7-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcmocka = "
 glibc
"

URI_libcmocka-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcmocka-devel-1.1.7-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcmocka-devel = "
 libcmocka
 cmake-filesystem
 pkgconf-pkg-config
"

URI_cmocka-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cmocka-doc-1.1.7-6.el10.noarch.rpm;unpack=0"
RDEPENDS:cmocka-doc = ""
