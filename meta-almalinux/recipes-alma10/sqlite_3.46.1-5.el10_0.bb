
PN = "sqlite"
PE = "0"
PV = "3.46.1"
PR = "5.el10_0"
PACKAGES = "sqlite-libs sqlite sqlite-devel lemon sqlite-analyzer sqlite-doc sqlite-tcl sqlite-tools"


URI_sqlite-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sqlite-libs-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:sqlite-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libz.so.1()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:sqlite-libs = "libsqlite3.so.0()(64bit) ( ) sqlite-libs ( =  3.46.1-5.el10_0) sqlite-libs(x86-64) ( =  3.46.1-5.el10_0)"

URI_sqlite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sqlite-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:sqlite = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libreadline.so.8()(64bit) ( ) sqlite-libs ( =  3.46.1-5.el10_0)"
RPROVIDES:sqlite = "sqlite(x86-64) ( =  3.46.1-5.el10_0) sqlite ( =  3.46.1-5.el10_0) sqlite3 ( =  3.46.1-5.el10_0)"

URI_sqlite-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sqlite-devel-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:sqlite-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libsqlite3.so.0()(64bit) ( ) sqlite(x86-64) ( =  3.46.1-5.el10_0)"
RPROVIDES:sqlite-devel = "pkgconfig(sqlite3) ( =  3.46.1) sqlite-devel ( =  3.46.1-5.el10_0) sqlite-devel(x86-64) ( =  3.46.1-5.el10_0)"

URI_lemon = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lemon-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:lemon = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:lemon = "lemon ( =  3.46.1-5.el10_0) lemon(x86-64) ( =  3.46.1-5.el10_0)"

URI_sqlite-analyzer = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sqlite-analyzer-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:sqlite-analyzer = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libtcl8.6.so()(64bit) ( ) tcl(abi) ( =  8.6) sqlite ( =  3.46.1-5.el10_0)"
RPROVIDES:sqlite-analyzer = "sqlite-analyzer ( =  3.46.1-5.el10_0) sqlite-analyzer(x86-64) ( =  3.46.1-5.el10_0)"

URI_sqlite-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sqlite-doc-3.46.1-5.el10_0.noarch.rpm;unpack=0"
RDEPENDS:sqlite-doc = ""
RPROVIDES:sqlite-doc = "sqlite-doc ( =  3.46.1-5.el10_0)"

URI_sqlite-tcl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sqlite-tcl-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:sqlite-tcl = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libz.so.1()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libsqlite3.so.0()(64bit) ( ) tcl(abi) ( =  8.6) sqlite ( =  3.46.1-5.el10_0)"
RPROVIDES:sqlite-tcl = "libtclsqlite3.so()(64bit) ( ) sqlite-tcl ( =  3.46.1-5.el10_0) sqlite-tcl(x86-64) ( =  3.46.1-5.el10_0)"

URI_sqlite-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sqlite-tools-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:sqlite-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:sqlite-tools = "sqlite-tools ( =  3.46.1-5.el10_0) sqlite-tools(x86-64) ( =  3.46.1-5.el10_0)"
