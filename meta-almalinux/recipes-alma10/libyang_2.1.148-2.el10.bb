
PN = "libyang"
PE = "0"
PV = "2.1.148"
PR = "2.el10"
PACKAGES = "libyang libyang-devel libyang-devel-doc libyang-tools"


URI_libyang = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libyang-2.1.148-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libyang = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpcre2-8.so.0()(64bit) ( )"
RPROVIDES:libyang = "libyang.so.2()(64bit) ( ) libyang ( =  2.1.148-2.el10) libyang(x86-64) ( =  2.1.148-2.el10)"

URI_libyang-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libyang-devel-2.1.148-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libyang-devel = "/usr/bin/pkg-config ( ) libyang.so.2()(64bit) ( ) pkgconfig(libpcre2-8) ( ) pcre2-devel ( ) libyang(x86-64) ( =  2.1.148-2.el10)"
RPROVIDES:libyang-devel = "libyang-devel ( =  2.1.148-2.el10) libyang-devel(x86-64) ( =  2.1.148-2.el10) pkgconfig(libyang) ( =  2.1.148)"

URI_libyang-devel-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libyang-devel-doc-2.1.148-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libyang-devel-doc = "libyang(x86-64) ( =  2.1.148-2.el10)"
RPROVIDES:libyang-devel-doc = "libyang-devel-doc ( =  2.1.148-2.el10) libyang-devel-doc(x86-64) ( =  2.1.148-2.el10)"

URI_libyang-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libyang-tools-2.1.148-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libyang-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libyang.so.2()(64bit) ( ) libyang(x86-64) ( =  2.1.148-2.el10)"
RPROVIDES:libyang-tools = "libyang-tools ( =  2.1.148-2.el10) libyang-tools(x86-64) ( =  2.1.148-2.el10)"
