
PN = "liblouis"
PE = "0"
PV = "3.28.0"
PR = "7.el10"
PACKAGES = "liblouis liblouis-tables python3-louis liblouis-devel liblouis-doc liblouis-utils"


URI_liblouis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblouis-3.28.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblouis = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) liblouis-tables ( =  3.28.0-7.el10)"
RPROVIDES:liblouis = "bundled(gnulib) ( ) liblouis.so.20()(64bit) ( ) liblouis ( =  3.28.0-7.el10) liblouis(x86-64) ( =  3.28.0-7.el10)"

URI_liblouis-tables = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblouis-tables-3.28.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:liblouis-tables = ""
RPROVIDES:liblouis-tables = "liblouis-tables ( =  3.28.0-7.el10)"

URI_python3-louis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-louis-3.28.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-louis = "python(abi) ( =  3.12) liblouis ( =  3.28.0-7.el10)"
RPROVIDES:python3-louis = "python-louis ( =  3.28.0-7.el10) python3-louis ( =  3.28.0-7.el10) python3.12-louis ( =  3.28.0-7.el10) python3.12dist(louis) ( =  3.28) python3dist(louis) ( =  3.28)"

URI_liblouis-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liblouis-devel-3.28.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblouis-devel = "/usr/bin/pkg-config ( ) liblouis.so.20()(64bit) ( ) liblouis(x86-64) ( =  3.28.0-7.el10)"
RPROVIDES:liblouis-devel = "liblouis-devel ( =  3.28.0-7.el10) liblouis-devel(x86-64) ( =  3.28.0-7.el10) pkgconfig(liblouis) ( =  3.28.0)"

URI_liblouis-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liblouis-doc-3.28.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:liblouis-doc = "liblouis ( =  3.28.0-7.el10)"
RPROVIDES:liblouis-doc = "liblouis-doc ( =  3.28.0-7.el10)"

URI_liblouis-utils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liblouis-utils-3.28.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblouis-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) liblouis.so.20()(64bit) ( ) libyaml-0.so.2()(64bit) ( ) liblouis(x86-64) ( =  3.28.0-7.el10)"
RPROVIDES:liblouis-utils = "liblouis-utils ( =  3.28.0-7.el10) liblouis-utils(x86-64) ( =  3.28.0-7.el10)"
