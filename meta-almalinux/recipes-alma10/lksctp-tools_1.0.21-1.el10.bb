
PN = "lksctp-tools"
PE = "0"
PV = "1.0.21"
PR = "1.el10"
PACKAGES = "lksctp-tools lksctp-tools-devel lksctp-tools-doc"


URI_lksctp-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lksctp-tools-1.0.21-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lksctp-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( )"
RPROVIDES:lksctp-tools = "libsctp.so.1()(64bit) ( ) libsctp.so.1(VERS_1)(64bit) ( ) libsctp.so.1(VERS_2)(64bit) ( ) libsctp.so.1(VERS_3)(64bit) ( ) libwithsctp.so.1()(64bit) ( ) lksctp-tools ( =  1.0.21-1.el10) lksctp-tools(x86-64) ( =  1.0.21-1.el10)"

URI_lksctp-tools-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lksctp-tools-devel-1.0.21-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lksctp-tools-devel = "/usr/bin/pkg-config ( ) libsctp.so.1()(64bit) ( ) libwithsctp.so.1()(64bit) ( ) lksctp-tools(x86-64) ( =  1.0.21-1.el10)"
RPROVIDES:lksctp-tools-devel = "lksctp-tools-devel ( =  1.0.21-1.el10) lksctp-tools-devel(x86-64) ( =  1.0.21-1.el10) pkgconfig(libsctp) ( =  1.0.21)"

URI_lksctp-tools-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lksctp-tools-doc-1.0.21-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lksctp-tools-doc = "lksctp-tools(x86-64) ( =  1.0.21-1.el10)"
RPROVIDES:lksctp-tools-doc = "lksctp-tools-doc ( =  1.0.21-1.el10) lksctp-tools-doc(x86-64) ( =  1.0.21-1.el10)"
