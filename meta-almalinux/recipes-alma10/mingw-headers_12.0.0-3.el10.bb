
PN = "mingw-headers"
PE = "0"
PV = "12.0.0"
PR = "3.el10"
PACKAGES = "mingw32-headers mingw64-headers ucrt64-headers"


URI_mingw32-headers = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-headers-12.0.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-headers = "mingw32-winpthreads ( ) mingw32-filesystem ( >=  95)"
RPROVIDES:mingw32-headers = "mingw32-headers ( =  12.0.0-3.el10)"

URI_mingw64-headers = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-headers-12.0.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-headers = "mingw64-winpthreads ( ) mingw64-filesystem ( >=  95)"
RPROVIDES:mingw64-headers = "mingw64-headers ( =  12.0.0-3.el10)"

URI_ucrt64-headers = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-headers-12.0.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:ucrt64-headers = "ucrt64-winpthreads ( ) ucrt64-filesystem ( >=  133)"
RPROVIDES:ucrt64-headers = "ucrt64-headers ( =  12.0.0-3.el10)"
