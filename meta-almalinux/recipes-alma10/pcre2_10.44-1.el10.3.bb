
PN = "pcre2"
PE = "0"
PV = "10.44"
PR = "1.el10.3"
PACKAGES = "pcre2 pcre2-syntax pcre2-devel pcre2-utf16 pcre2-utf32 pcre2-static pcre2-tools"


URI_pcre2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pcre2-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcre2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) pcre2-syntax ( =  10.44-1.el10.3)"
RPROVIDES:pcre2 = "libpcre2-8.so.0()(64bit) ( ) bundled(sljit) ( ) libpcre2-posix.so.3()(64bit) ( ) pcre2 ( =  10.44-1.el10.3) pcre2(x86-64) ( =  10.44-1.el10.3)"

URI_pcre2-syntax = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pcre2-syntax-10.44-1.el10.3.noarch.rpm;unpack=0"
RDEPENDS:pcre2-syntax = ""
RPROVIDES:pcre2-syntax = "pcre2-syntax ( =  10.44-1.el10.3)"

URI_pcre2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcre2-devel-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcre2-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) libpcre2-8.so.0()(64bit) ( ) libpcre2-posix.so.3()(64bit) ( ) libpcre2-16.so.0()(64bit) ( ) pkgconfig(libpcre2-8) ( ) libpcre2-32.so.0()(64bit) ( ) pcre2-utf16(x86-64) ( =  10.44-1.el10.3) pcre2-utf32(x86-64) ( =  10.44-1.el10.3) pcre2(x86-64) ( =  10.44-1.el10.3)"
RPROVIDES:pcre2-devel = "pcre2-devel ( =  10.44-1.el10.3) pcre2-devel(x86-64) ( =  10.44-1.el10.3) pkgconfig(libpcre2-16) ( =  10.44) pkgconfig(libpcre2-32) ( =  10.44) pkgconfig(libpcre2-8) ( =  10.44) pkgconfig(libpcre2-posix) ( =  10.44)"

URI_pcre2-utf16 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcre2-utf16-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcre2-utf16 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) pcre2-syntax ( =  10.44-1.el10.3)"
RPROVIDES:pcre2-utf16 = "libpcre2-16.so.0()(64bit) ( ) bundled(sljit) ( ) pcre2-utf16(x86-64) ( =  10.44-1.el10.3) pcre2-utf16 ( =  10.44-1.el10.3)"

URI_pcre2-utf32 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcre2-utf32-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcre2-utf32 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) pcre2-syntax ( =  10.44-1.el10.3)"
RPROVIDES:pcre2-utf32 = "libpcre2-32.so.0()(64bit) ( ) bundled(sljit) ( ) pcre2-utf32(x86-64) ( =  10.44-1.el10.3) pcre2-utf32 ( =  10.44-1.el10.3)"

URI_pcre2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pcre2-static-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcre2-static = "pcre2-devel(x86-64) ( =  10.44-1.el10.3)"
RPROVIDES:pcre2-static = "bundled(sljit) ( ) pcre2-static ( =  10.44-1.el10.3) pcre2-static(x86-64) ( =  10.44-1.el10.3)"

URI_pcre2-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pcre2-tools-10.44-1.el10.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcre2-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libreadline.so.8()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libpcre2-16.so.0()(64bit) ( ) libpcre2-32.so.0()(64bit) ( ) libpcre2-posix.so.3()(64bit) ( ) pcre2(x86-64) ( =  10.44-1.el10.3) pcre2-utf16 ( =  10.44-1.el10.3) pcre2-utf32 ( =  10.44-1.el10.3)"
RPROVIDES:pcre2-tools = "pcre2-tools ( =  10.44-1.el10.3) pcre2-tools(x86-64) ( =  10.44-1.el10.3)"
