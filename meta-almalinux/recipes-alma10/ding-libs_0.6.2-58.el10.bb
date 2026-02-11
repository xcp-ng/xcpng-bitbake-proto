
PN = "ding-libs"
PE = "0"
PV = "0.6.2"
PR = "58.el10"
PACKAGES = "libbasicobjects libcollection libdhash libini_config libpath_utils libref_array libbasicobjects-devel libcollection-devel libdhash-devel libini_config-devel libpath_utils-devel libref_array-devel"


URI_libbasicobjects = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libbasicobjects-0.1.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbasicobjects = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libbasicobjects = "libbasicobjects.so.0()(64bit) ( ) libbasicobjects.so.0(BASICOBJECTS_0.1.0)(64bit) ( ) libbasicobjects.so.0(BASICOBJECTS_0.1.1)(64bit) ( ) libbasicobjects(x86-64) ( =  0.1.1-58.el10) libbasicobjects ( =  0.1.1-58.el10)"

URI_libcollection = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcollection-0.7.0-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcollection = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libcollection = "libcollection.so.4()(64bit) ( ) libcollection.so.4(COLLECTION_0.6.2)(64bit) ( ) libcollection.so.4(COLLECTION_0.7)(64bit) ( ) libcollection(x86-64) ( =  0.7.0-58.el10) libcollection ( =  0.7.0-58.el10)"

URI_libdhash = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libdhash-0.5.0-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdhash = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libdhash = "libdhash.so.1()(64bit) ( ) libdhash.so.1(DHASH_0.4.3)(64bit) ( ) libdhash ( =  0.5.0-58.el10) libdhash(x86-64) ( =  0.5.0-58.el10)"

URI_libini_config = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libini_config-1.3.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libini_config = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libref_array.so.1()(64bit) ( ) libbasicobjects.so.0()(64bit) ( ) libcollection.so.4()(64bit) ( ) libref_array.so.1(REF_ARRAY_0.1.1)(64bit) ( ) libbasicobjects.so.0(BASICOBJECTS_0.1.0)(64bit) ( ) libbasicobjects.so.0(BASICOBJECTS_0.1.1)(64bit) ( ) libcollection.so.4(COLLECTION_0.6.2)(64bit) ( ) libcollection.so.4(COLLECTION_0.7)(64bit) ( ) libpath_utils.so.1()(64bit) ( ) libpath_utils.so.1(PATH_UTILS_0.2.1)(64bit) ( ) libref_array.so.1(REF_ARRAY_0.1.4)(64bit) ( ) libbasicobjects(x86-64) ( =  0.1.1-58.el10) libcollection(x86-64) ( =  0.7.0-58.el10) libpath_utils(x86-64) ( =  0.2.1-58.el10) libref_array(x86-64) ( =  0.1.5-58.el10)"
RPROVIDES:libini_config = "libini_config.so.5()(64bit) ( ) libini_config.so.5(INI_CONFIG_1.1.0)(64bit) ( ) libini_config.so.5(INI_CONFIG_1.2.0)(64bit) ( ) libini_config.so.5(INI_CONFIG_1.3.0)(64bit) ( ) libini_config ( =  1.3.1-58.el10) libini_config(x86-64) ( =  1.3.1-58.el10)"

URI_libpath_utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpath_utils-0.2.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpath_utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:libpath_utils = "libpath_utils.so.1()(64bit) ( ) libpath_utils.so.1(PATH_UTILS_0.2.1)(64bit) ( ) libpath_utils(x86-64) ( =  0.2.1-58.el10) libpath_utils ( =  0.2.1-58.el10)"

URI_libref_array = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libref_array-0.1.5-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libref_array = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libref_array = "libref_array.so.1()(64bit) ( ) libref_array.so.1(REF_ARRAY_0.1.1)(64bit) ( ) libref_array.so.1(REF_ARRAY_0.1.4)(64bit) ( ) libref_array(x86-64) ( =  0.1.5-58.el10) libref_array ( =  0.1.5-58.el10)"

URI_libbasicobjects-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libbasicobjects-devel-0.1.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbasicobjects-devel = "/usr/bin/pkg-config ( ) libbasicobjects.so.0()(64bit) ( ) libbasicobjects ( =  0.1.1-58.el10)"
RPROVIDES:libbasicobjects-devel = "libbasicobjects-devel ( =  0.1.1-58.el10) libbasicobjects-devel(x86-64) ( =  0.1.1-58.el10) pkgconfig(basicobjects) ( =  0.1.1)"

URI_libcollection-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcollection-devel-0.7.0-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcollection-devel = "/usr/bin/pkg-config ( ) libcollection.so.4()(64bit) ( ) libcollection ( =  0.7.0-58.el10)"
RPROVIDES:libcollection-devel = "libcollection-devel ( =  0.7.0-58.el10) libcollection-devel(x86-64) ( =  0.7.0-58.el10) pkgconfig(collection) ( =  0.7.0)"

URI_libdhash-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdhash-devel-0.5.0-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdhash-devel = "/usr/bin/pkg-config ( ) libdhash.so.1()(64bit) ( ) libdhash ( =  0.5.0-58.el10)"
RPROVIDES:libdhash-devel = "libdhash-devel ( =  0.5.0-58.el10) libdhash-devel(x86-64) ( =  0.5.0-58.el10) pkgconfig(dhash) ( =  0.5.0)"

URI_libini_config-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libini_config-devel-1.3.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libini_config-devel = "/usr/bin/pkg-config ( ) pkgconfig(basicobjects) ( ) pkgconfig(collection) ( ) pkgconfig(ref_array) ( ) libini_config.so.5()(64bit) ( ) libbasicobjects-devel ( =  0.1.1-58.el10) libcollection-devel ( =  0.7.0-58.el10) libref_array-devel ( =  0.1.5-58.el10) libini_config ( =  1.3.1-58.el10)"
RPROVIDES:libini_config-devel = "libini_config-devel ( =  1.3.1-58.el10) libini_config-devel(x86-64) ( =  1.3.1-58.el10) pkgconfig(ini_config) ( =  1.3.1)"

URI_libpath_utils-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libpath_utils-devel-0.2.1-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpath_utils-devel = "/usr/bin/pkg-config ( ) libpath_utils.so.1()(64bit) ( ) libpath_utils ( =  0.2.1-58.el10)"
RPROVIDES:libpath_utils-devel = "libpath_utils-devel ( =  0.2.1-58.el10) libpath_utils-devel(x86-64) ( =  0.2.1-58.el10) pkgconfig(path_utils) ( =  0.2.1)"

URI_libref_array-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libref_array-devel-0.1.5-58.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libref_array-devel = "/usr/bin/pkg-config ( ) libref_array.so.1()(64bit) ( ) libref_array ( =  0.1.5-58.el10)"
RPROVIDES:libref_array-devel = "libref_array-devel ( =  0.1.5-58.el10) libref_array-devel(x86-64) ( =  0.1.5-58.el10) pkgconfig(ref_array) ( =  0.1.5)"
