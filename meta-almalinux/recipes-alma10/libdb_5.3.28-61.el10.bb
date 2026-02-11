
PN = "libdb"
PE = "0"
PV = "5.3.28"
PR = "61.el10"
PACKAGES = "libdb libdb-convert-util libdb-cxx libdb-cxx-devel libdb-devel libdb-devel-doc libdb-devel-static libdb-sql libdb-sql-devel libdb-tcl libdb-tcl-devel libdb-utils"


URI_libdb = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libdb = "deprecated() ( ) libdb-5.3.so()(64bit) ( ) libdb(x86-64) ( =  5.3.28-61.el10) libdb ( =  5.3.28-61.el10)"

URI_libdb-convert-util = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-convert-util-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-convert-util = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) liblmdb.so.0.0.0()(64bit) ( ) libgdbm.so.6()(64bit) ( ) libgdbm_compat.so.4()(64bit) ( )"
RPROVIDES:libdb-convert-util = "libdb-convert-util ( =  5.3.28-61.el10) libdb-convert-util(x86-64) ( =  5.3.28-61.el10)"

URI_libdb-cxx = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-cxx-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-cxx = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libdb(x86-64) ( =  5.3.28-61.el10)"
RPROVIDES:libdb-cxx = "deprecated() ( ) libdb_cxx-5.3.so()(64bit) ( ) libdb-cxx(x86-64) ( =  5.3.28-61.el10) libdb-cxx ( =  5.3.28-61.el10)"

URI_libdb-cxx-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-cxx-devel-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-cxx-devel = "libdb-devel(x86-64) ( =  5.3.28-61.el10) libdb-cxx(x86-64) ( =  5.3.28-61.el10)"
RPROVIDES:libdb-cxx-devel = "deprecated() ( ) libdb-cxx-devel ( =  5.3.28-61.el10) libdb-cxx-devel(x86-64) ( =  5.3.28-61.el10)"

URI_libdb-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-devel-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-devel = "libdb(x86-64) ( =  5.3.28-61.el10)"
RPROVIDES:libdb-devel = "deprecated() ( ) libdb-devel(x86-64) ( =  5.3.28-61.el10) libdb-devel ( =  5.3.28-61.el10)"

URI_libdb-devel-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-devel-doc-5.3.28-61.el10.noarch.rpm;unpack=0"
RDEPENDS:libdb-devel-doc = "libdb ( =  5.3.28-61.el10) libdb-devel ( =  5.3.28-61.el10)"
RPROVIDES:libdb-devel-doc = "deprecated() ( ) libdb-devel-doc ( =  5.3.28-61.el10)"

URI_libdb-devel-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-devel-static-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-devel-static = "libdb-devel(x86-64) ( =  5.3.28-61.el10)"
RPROVIDES:libdb-devel-static = "deprecated() ( ) libdb-devel-static ( =  5.3.28-61.el10) libdb-devel-static(x86-64) ( =  5.3.28-61.el10)"

URI_libdb-sql = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-sql-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-sql = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libdb(x86-64) ( =  5.3.28-61.el10)"
RPROVIDES:libdb-sql = "deprecated() ( ) libdb_sql-5.3.so()(64bit) ( ) libdb-sql(x86-64) ( =  5.3.28-61.el10) libdb-sql ( =  5.3.28-61.el10)"

URI_libdb-sql-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-sql-devel-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-sql-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libdb_sql-5.3.so()(64bit) ( ) libdb-sql(x86-64) ( =  5.3.28-61.el10)"
RPROVIDES:libdb-sql-devel = "deprecated() ( ) libdb-sql-devel ( =  5.3.28-61.el10) libdb-sql-devel(x86-64) ( =  5.3.28-61.el10)"

URI_libdb-tcl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-tcl-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-tcl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libdb(x86-64) ( =  5.3.28-61.el10)"
RPROVIDES:libdb-tcl = "deprecated() ( ) libdb_tcl-5.3.so()(64bit) ( ) libdb-tcl(x86-64) ( =  5.3.28-61.el10) libdb-tcl ( =  5.3.28-61.el10)"

URI_libdb-tcl-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-tcl-devel-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-tcl-devel = "libdb-tcl(x86-64) ( =  5.3.28-61.el10)"
RPROVIDES:libdb-tcl-devel = "deprecated() ( ) libdb-tcl-devel ( =  5.3.28-61.el10) libdb-tcl-devel(x86-64) ( =  5.3.28-61.el10)"

URI_libdb-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdb-utils-5.3.28-61.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdb-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libdb-5.3.so()(64bit) ( ) libdb(x86-64) ( =  5.3.28-61.el10)"
RPROVIDES:libdb-utils = "deprecated() ( ) libdb-utils ( =  5.3.28-61.el10) libdb-utils(x86-64) ( =  5.3.28-61.el10)"
