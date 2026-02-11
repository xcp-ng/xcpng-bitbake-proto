
inherit dnf-bridge

PN = "mingw-libffi"
PE = "0"
PV = "3.4.6"
PR = "2.el10"
PACKAGES = "mingw32-libffi mingw64-libffi mingw32-libffi-static mingw64-libffi-static"


URI_mingw32-libffi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-libffi-3.4.6-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-libffi = " \
 mingw32-crt \
 mingw32-filesystem \
"

URI_mingw64-libffi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-libffi-3.4.6-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-libffi = " \
 mingw64-crt \
 mingw64-filesystem \
"

URI_mingw32-libffi-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-libffi-static-3.4.6-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-libffi-static = ""

URI_mingw64-libffi-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-libffi-static-3.4.6-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-libffi-static = ""
