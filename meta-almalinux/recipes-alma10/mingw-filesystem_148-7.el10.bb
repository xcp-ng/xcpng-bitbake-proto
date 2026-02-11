
PN = "mingw-filesystem"
PE = "0"
PV = "148"
PR = "7.el10"
PACKAGES = "mingw-filesystem-base mingw32-filesystem mingw64-filesystem ucrt64-filesystem"


URI_mingw-filesystem-base = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw-filesystem-base-148-7.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw-filesystem-base = "
 redhat-rpm-config
 pkgconf
 bash
 cmake-rpm-macros
"

URI_mingw32-filesystem = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-filesystem-148-7.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-filesystem = "
 mingw-binutils-generic
 mingw-filesystem-base
"

URI_mingw64-filesystem = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-filesystem-148-7.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-filesystem = "
 mingw-binutils-generic
 mingw-filesystem-base
"

URI_ucrt64-filesystem = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-filesystem-148-7.el10.noarch.rpm;unpack=0"
RDEPENDS:ucrt64-filesystem = "
 mingw-binutils-generic
 mingw-filesystem-base
"
