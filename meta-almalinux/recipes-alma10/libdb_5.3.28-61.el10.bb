
PN = "libdb"
PE = "0"
PV = "5.3.28"
PR = "61.el10"
PACKAGES = "libdb libdb-convert-util libdb-cxx libdb-cxx-devel libdb-devel libdb-devel-doc libdb-devel-static libdb-sql libdb-sql-devel libdb-tcl libdb-tcl-devel libdb-utils"


URI_libdb = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb = " \
 glibc \
"

URI_libdb-convert-util = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-convert-util-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-convert-util = " \
 libgcc \
 gdbm-libs \
 libstdc++ \
 glibc \
 lmdb-libs \
"

URI_libdb-cxx = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-cxx-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-cxx = " \
 glibc \
 libgcc \
 libstdc++ \
 libdb \
"

URI_libdb-cxx-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-cxx-devel-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-cxx-devel = " \
 libdb-cxx \
 libdb-devel \
"

URI_libdb-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-devel-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-devel = " \
 libdb \
"

URI_libdb-devel-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-devel-doc-5.3.28-61.el10.noarch.rpm;unpack=0"
RDEPENDS:libdb-devel-doc = " \
 libdb-devel \
 libdb \
"

URI_libdb-devel-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-devel-static-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-devel-static = " \
 libdb-devel \
"

URI_libdb-sql = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-sql-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-sql = " \
 glibc \
 libdb \
"

URI_libdb-sql-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-sql-devel-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-sql-devel = " \
 glibc \
 libdb-sql \
"

URI_libdb-tcl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-tcl-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-tcl = " \
 glibc \
 libdb \
"

URI_libdb-tcl-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-tcl-devel-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-tcl-devel = " \
 libdb-tcl \
"

URI_libdb-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-utils-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-utils = " \
 glibc \
 libdb \
"
