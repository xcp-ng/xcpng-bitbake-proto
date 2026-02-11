
PN = "binutils"
PE = "0"
PV = "2.41"
PR = "53.el10.alma.1"
PACKAGES = "binutils binutils-gold binutils-devel binutils-gprofng cross-binutils-aarch64 cross-binutils-ppc64le cross-binutils-s390x"


URI_binutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/binutils-2.41-53.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:binutils = "
 zlib-ng-compat
 jansson
 elfutils-debuginfod-client
 libgcc
 libstdc++
 bash
 glibc
 coreutils
 binutils-gold
 alternatives
"

URI_binutils-gold = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/binutils-gold-2.41-53.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:binutils-gold = "
 zlib-ng-compat
 jansson
 libgcc
 libstdc++
 bash
 binutils
 glibc
"

URI_binutils-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/binutils-devel-2.41-53.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:binutils-devel = "
 coreutils
 zlib-ng-compat-devel
 binutils
"

URI_binutils-gprofng = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/binutils-gprofng-2.41-53.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:binutils-gprofng = "
 libgcc
 libstdc++
 binutils
 glibc
 perl-interpreter
"

URI_cross-binutils-aarch64 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cross-binutils-aarch64-2.41-53.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cross-binutils-aarch64 = "
 zlib-ng-compat
 jansson
 elfutils-debuginfod-client
 libgcc
 zlib-ng-compat-devel
 libstdc++
 glibc
 coreutils
 perl-interpreter
"

URI_cross-binutils-ppc64le = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cross-binutils-ppc64le-2.41-53.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cross-binutils-ppc64le = "
 zlib-ng-compat
 jansson
 elfutils-debuginfod-client
 zlib-ng-compat-devel
 glibc
 coreutils
"

URI_cross-binutils-s390x = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cross-binutils-s390x-2.41-53.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cross-binutils-s390x = "
 zlib-ng-compat
 jansson
 elfutils-debuginfod-client
 zlib-ng-compat-devel
 glibc
 coreutils
"
