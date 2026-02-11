
PN = "utf8proc"
PE = "0"
PV = "2.7.0"
PR = "9.el10"
PACKAGES = "utf8proc utf8proc-devel"


URI_utf8proc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/utf8proc-2.7.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:utf8proc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:utf8proc = "libutf8proc.so.2()(64bit) ( ) utf8proc ( =  2.7.0-9.el10) utf8proc(x86-64) ( =  2.7.0-9.el10)"

URI_utf8proc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/utf8proc-devel-2.7.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:utf8proc-devel = "/usr/bin/pkg-config ( ) libutf8proc.so.2()(64bit) ( ) utf8proc(x86-64) ( =  2.7.0-9.el10)"
RPROVIDES:utf8proc-devel = "pkgconfig(libutf8proc) ( =  2.5.0) utf8proc-devel ( =  2.7.0-9.el10) utf8proc-devel(x86-64) ( =  2.7.0-9.el10)"
