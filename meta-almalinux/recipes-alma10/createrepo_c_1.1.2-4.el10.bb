
PN = "createrepo_c"
PE = "0"
PV = "1.1.2"
PR = "4.el10"
PACKAGES = "createrepo_c createrepo_c-libs python3-createrepo_c createrepo_c-devel"


URI_createrepo_c = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/createrepo_c-1.1.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:createrepo_c = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libcreaterepo_c.so.1()(64bit) ( ) libmodulemd.so.2()(64bit) ( ) createrepo_c-libs ( =  1.1.2-4.el10) libmodulemd(x86-64) ( >=  2.3.0) rpm ( >=  4.9.0)"
RPROVIDES:createrepo_c = "createrepo ( =  1.1.2-4.el10) createrepo_c ( =  1.1.2-4.el10) createrepo_c(x86-64) ( =  1.1.2-4.el10)"

URI_createrepo_c-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/createrepo_c-libs-1.1.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:createrepo_c-libs = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libzstd.so.1()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libcurl.so.4()(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) librpm.so.10()(64bit) ( ) libbz2.so.1()(64bit) ( ) librpmio.so.10()(64bit) ( ) libmodulemd.so.2()(64bit) ( ) libz.so.1(ZLIB_1.2.3.5)(64bit) ( )"
RPROVIDES:createrepo_c-libs = "libcreaterepo_c.so.1()(64bit) ( ) createrepo_c-libs ( =  1.1.2-4.el10) createrepo_c-libs(x86-64) ( =  1.1.2-4.el10)"

URI_python3-createrepo_c = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-createrepo_c-1.1.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-createrepo_c = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libcreaterepo_c.so.1()(64bit) ( ) python(abi) ( =  3.12) createrepo_c-libs ( =  1.1.2-4.el10)"
RPROVIDES:python3-createrepo_c = "python-createrepo_c ( =  1.1.2-4.el10) python3-createrepo_c ( =  1.1.2-4.el10) python3-createrepo_c(x86-64) ( =  1.1.2-4.el10) python3.12-createrepo_c ( =  1.1.2-4.el10) python3.12dist(createrepo-c) ( =  1.1.2) python3dist(createrepo-c) ( =  1.1.2)"

URI_createrepo_c-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/createrepo_c-devel-1.1.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:createrepo_c-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(zlib) ( ) pkgconfig(libxml-2.0) ( ) pkgconfig(libcurl) ( ) pkgconfig(sqlite3) ( ) pkgconfig(rpm) ( ) libcreaterepo_c.so.1()(64bit) ( ) createrepo_c-libs(x86-64) ( =  1.1.2-4.el10)"
RPROVIDES:createrepo_c-devel = "createrepo_c-devel ( =  1.1.2-4.el10) createrepo_c-devel(x86-64) ( =  1.1.2-4.el10) pkgconfig(createrepo_c) ( =  1.1.2)"
