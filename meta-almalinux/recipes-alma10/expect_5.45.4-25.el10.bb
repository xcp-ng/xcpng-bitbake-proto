
PN = "expect"
PE = "0"
PV = "5.45.4"
PR = "25.el10"
PACKAGES = "expect expect-devel expectk"


URI_expect = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/expect-5.45.4-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:expect = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libtcl8.6.so()(64bit) ( )"
RPROVIDES:expect = "libexpect5.45.4.so()(64bit) ( ) expect ( =  5.45.4-25.el10) expect(x86-64) ( =  5.45.4-25.el10)"

URI_expect-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/expect-devel-5.45.4-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:expect-devel = "expect ( =  5.45.4-25.el10)"
RPROVIDES:expect-devel = "expect-devel ( =  5.45.4-25.el10) expect-devel(x86-64) ( =  5.45.4-25.el10)"

URI_expectk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/expectk-5.45.4-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:expectk = "/usr/bin/sh ( ) expect ( =  5.45.4-25.el10)"
RPROVIDES:expectk = "expectk ( =  5.45.4-25.el10) expectk(x86-64) ( =  5.45.4-25.el10)"
