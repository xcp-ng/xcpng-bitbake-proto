
PN = "libtdb"
PE = "0"
PV = "1.4.12"
PR = "102.el10"
PACKAGES = "libtdb python3-tdb tdb-tools libtdb-devel"


URI_libtdb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtdb-1.4.12-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtdb = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libtdb = "libtdb.so.1()(64bit) ( ) libtdb.so.1(TDB_1.2.1)(64bit) ( ) bundled(libreplace) ( ) libtdb.so.1(TDB_1.2.2)(64bit) ( ) libtdb.so.1(TDB_1.2.5)(64bit) ( ) libtdb.so.1(TDB_1.3.11)(64bit) ( ) libtdb.so.1(TDB_1.3.0)(64bit) ( ) libtdb.so.1(TDB_1.3.14)(64bit) ( ) libtdb.so.1(TDB_1.3.17)(64bit) ( ) libtdb.so.1(TDB_1.2.11)(64bit) ( ) libtdb.so.1(TDB_1.2.9)(64bit) ( ) libtdb.so.1(TDB_1.2.10)(64bit) ( ) libtdb.so.1(TDB_1.2.12)(64bit) ( ) libtdb.so.1(TDB_1.2.13)(64bit) ( ) libtdb.so.1(TDB_1.2.3)(64bit) ( ) libtdb.so.1(TDB_1.2.4)(64bit) ( ) libtdb.so.1(TDB_1.2.6)(64bit) ( ) libtdb.so.1(TDB_1.2.7)(64bit) ( ) libtdb.so.1(TDB_1.2.8)(64bit) ( ) libtdb.so.1(TDB_1.3.1)(64bit) ( ) libtdb.so.1(TDB_1.3.10)(64bit) ( ) libtdb.so.1(TDB_1.3.12)(64bit) ( ) libtdb.so.1(TDB_1.3.13)(64bit) ( ) libtdb.so.1(TDB_1.3.15)(64bit) ( ) libtdb.so.1(TDB_1.3.16)(64bit) ( ) libtdb.so.1(TDB_1.3.18)(64bit) ( ) libtdb.so.1(TDB_1.3.2)(64bit) ( ) libtdb.so.1(TDB_1.3.3)(64bit) ( ) libtdb.so.1(TDB_1.3.4)(64bit) ( ) libtdb.so.1(TDB_1.3.5)(64bit) ( ) libtdb.so.1(TDB_1.3.6)(64bit) ( ) libtdb.so.1(TDB_1.3.7)(64bit) ( ) libtdb.so.1(TDB_1.3.8)(64bit) ( ) libtdb.so.1(TDB_1.3.9)(64bit) ( ) libtdb.so.1(TDB_1.4.0)(64bit) ( ) libtdb.so.1(TDB_1.4.1)(64bit) ( ) libtdb.so.1(TDB_1.4.10)(64bit) ( ) libtdb.so.1(TDB_1.4.11)(64bit) ( ) libtdb.so.1(TDB_1.4.12)(64bit) ( ) libtdb.so.1(TDB_1.4.2)(64bit) ( ) libtdb.so.1(TDB_1.4.3)(64bit) ( ) libtdb.so.1(TDB_1.4.4)(64bit) ( ) libtdb.so.1(TDB_1.4.5)(64bit) ( ) libtdb.so.1(TDB_1.4.6)(64bit) ( ) libtdb.so.1(TDB_1.4.7)(64bit) ( ) libtdb.so.1(TDB_1.4.8)(64bit) ( ) libtdb.so.1(TDB_1.4.9)(64bit) ( ) libtdb ( =  1.4.12-102.el10) libtdb(x86-64) ( =  1.4.12-102.el10)"

URI_python3-tdb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-tdb-1.4.12-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-tdb = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libtdb.so.1()(64bit) ( ) libtdb.so.1(TDB_1.2.1)(64bit) ( ) libtdb.so.1(TDB_1.3.11)(64bit) ( ) python(abi) ( =  3.12) libtdb ( =  1.4.12-102.el10)"
RPROVIDES:python3-tdb = "python-tdb ( =  1.4.12-102.el10) python3-tdb ( =  1.4.12-102.el10) python3-tdb(x86-64) ( =  1.4.12-102.el10) python3.12-tdb ( =  1.4.12-102.el10)"

URI_tdb-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tdb-tools-1.4.12-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tdb-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libtdb.so.1()(64bit) ( ) libtdb.so.1(TDB_1.2.1)(64bit) ( ) libtdb.so.1(TDB_1.2.11)(64bit) ( ) libtdb.so.1(TDB_1.2.9)(64bit) ( ) libtdb ( =  1.4.12-102.el10)"
RPROVIDES:tdb-tools = "tdb-tools ( =  1.4.12-102.el10) tdb-tools(x86-64) ( =  1.4.12-102.el10)"

URI_libtdb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtdb-devel-1.4.12-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtdb-devel = "/usr/bin/pkg-config ( ) libtdb.so.1()(64bit) ( ) libtdb ( =  1.4.12-102.el10)"
RPROVIDES:libtdb-devel = "libtdb-devel ( =  1.4.12-102.el10) libtdb-devel(x86-64) ( =  1.4.12-102.el10) pkgconfig(tdb) ( =  1.4.12)"
