
PN = "dtc"
PE = "0"
PV = "1.7.0"
PR = "12.el10"
PACKAGES = "dtc libfdt libfdt-devel libfdt-static python3-libfdt"


URI_dtc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dtc-1.7.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dtc = "
 glibc
 libfdt
 bash
"

URI_libfdt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libfdt-1.7.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfdt = "
 glibc
"

URI_libfdt-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfdt-devel-1.7.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfdt-devel = "
 libfdt
"

URI_libfdt-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfdt-static-1.7.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfdt-static = "
 libfdt-devel
"

URI_python3-libfdt = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-libfdt-1.7.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libfdt = "
 glibc
 dtc
 python3
"
