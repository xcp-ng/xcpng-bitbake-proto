
PN = "mingw-winpthreads"
PE = "0"
PV = "12.0.0"
PR = "3.el10"
PACKAGES = "mingw32-winpthreads mingw32-winpthreads-static mingw64-winpthreads mingw64-winpthreads-static ucrt64-winpthreads ucrt64-winpthreads-static"


URI_mingw32-winpthreads = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-winpthreads-12.0.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-winpthreads = "
 mingw32-crt
 mingw32-filesystem
"

URI_mingw32-winpthreads-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-winpthreads-static-12.0.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-winpthreads-static = "
 mingw32-winpthreads
"

URI_mingw64-winpthreads = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-winpthreads-12.0.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-winpthreads = "
 mingw64-crt
 mingw64-filesystem
"

URI_mingw64-winpthreads-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-winpthreads-static-12.0.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-winpthreads-static = "
 mingw64-winpthreads
"

URI_ucrt64-winpthreads = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-winpthreads-12.0.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:ucrt64-winpthreads = "
 ucrt64-crt
 ucrt64-filesystem
"

URI_ucrt64-winpthreads-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-winpthreads-static-12.0.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:ucrt64-winpthreads-static = "
 ucrt64-winpthreads
"
