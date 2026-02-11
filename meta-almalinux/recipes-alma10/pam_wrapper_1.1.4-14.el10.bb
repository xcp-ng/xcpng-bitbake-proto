
PN = "pam_wrapper"
PE = "0"
PV = "1.1.4"
PR = "14.el10"
PACKAGES = "pam_wrapper libpamtest libpamtest-devel libpamtest-doc python3-libpamtest"


URI_pam_wrapper = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pam_wrapper-1.1.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pam_wrapper = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) cmake-filesystem(x86-64) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( )"
RPROVIDES:pam_wrapper = "libpam_wrapper.so.0()(64bit) ( ) cmake(pam_wrapper) ( =  1.1.4) pam_wrapper ( =  1.1.4-14.el10) pam_wrapper(x86-64) ( =  1.1.4-14.el10) pkgconfig(pam_wrapper) ( =  1.1.4)"

URI_libpamtest = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpamtest-1.1.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpamtest = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) pam_wrapper ( =  1.1.4-14.el10)"
RPROVIDES:libpamtest = "libpamtest.so.0()(64bit) ( ) libpamtest ( =  1.1.4-14.el10) libpamtest(x86-64) ( =  1.1.4-14.el10)"

URI_libpamtest-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpamtest-devel-1.1.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpamtest-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libpamtest.so.0()(64bit) ( ) pam_wrapper ( =  1.1.4-14.el10) libpamtest ( =  1.1.4-14.el10)"
RPROVIDES:libpamtest-devel = "pkgconfig(libpamtest) ( ) cmake(pamtest) ( =  1.1.4) libpamtest-devel ( =  1.1.4-14.el10) libpamtest-devel(x86-64) ( =  1.1.4-14.el10)"

URI_libpamtest-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpamtest-doc-1.1.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpamtest-doc = ""
RPROVIDES:libpamtest-doc = "libpamtest-doc ( =  1.1.4-14.el10) libpamtest-doc(x86-64) ( =  1.1.4-14.el10)"

URI_python3-libpamtest = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-libpamtest-1.1.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libpamtest = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libpamtest.so.0()(64bit) ( ) python(abi) ( =  3.12) pam_wrapper ( =  1.1.4-14.el10) libpamtest ( =  1.1.4-14.el10)"
RPROVIDES:python3-libpamtest = "python-libpamtest ( =  1.1.4-14.el10) python3-libpamtest ( =  1.1.4-14.el10) python3-libpamtest(x86-64) ( =  1.1.4-14.el10) python3.12-libpamtest ( =  1.1.4-14.el10)"
