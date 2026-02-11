
PN = "giflib"
PE = "0"
PV = "5.2.1"
PR = "22.el10"
PACKAGES = "giflib giflib-devel giflib-utils mingw32-giflib mingw32-giflib-tools mingw64-giflib mingw64-giflib-tools"


URI_giflib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/giflib-5.2.1-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:giflib = " \
 glibc \
"

URI_giflib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/giflib-devel-5.2.1-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:giflib-devel = " \
 giflib \
"

URI_giflib-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/giflib-utils-5.2.1-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:giflib-utils = " \
 glibc \
 giflib \
"

URI_mingw32-giflib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-giflib-5.2.1-22.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-giflib = " \
 mingw32-crt \
 mingw32-filesystem \
 mingw32-libgcc \
"

URI_mingw32-giflib-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-giflib-tools-5.2.1-22.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-giflib-tools = " \
 mingw32-filesystem \
 mingw32-crt \
 mingw32-giflib \
"

URI_mingw64-giflib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-giflib-5.2.1-22.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-giflib = " \
 mingw64-crt \
 mingw64-filesystem \
"

URI_mingw64-giflib-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-giflib-tools-5.2.1-22.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-giflib-tools = " \
 mingw64-giflib \
 mingw64-crt \
 mingw64-filesystem \
"
