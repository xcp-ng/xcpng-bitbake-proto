
PN = "sudo"
PE = "0"
PV = "1.9.15"
PR = "8.p5.el10_0.2"
PACKAGES = "sudo sudo-python-plugin sudo-devel"


URI_sudo = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sudo-1.9.15-8.p5.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:sudo = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libz.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) liblber.so.2()(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) libaudit.so.1()(64bit) ( ) pam ( ) libz.so.1(ZLIB_1.2.0.2)(64bit) ( )"
RPROVIDES:sudo = "libsudo_util.so.0()(64bit) ( ) config(sudo) ( =  1.9.15-8.p5.el10_0.2) sudo ( =  1.9.15-8.p5.el10_0.2) sudo(x86-64) ( =  1.9.15-8.p5.el10_0.2)"

URI_sudo-python-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sudo-python-plugin-1.9.15-8.p5.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:sudo-python-plugin = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libsudo_util.so.0()(64bit) ( ) sudo ( =  1.9.15-8.p5.el10_0.2)"
RPROVIDES:sudo-python-plugin = "sudo-python-plugin(x86-64) ( =  1.9.15-8.p5.el10_0.2) sudo-python-plugin ( =  1.9.15-8.p5.el10_0.2)"

URI_sudo-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sudo-devel-1.9.15-8.p5.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:sudo-devel = "sudo ( =  1.9.15-8.p5.el10_0.2)"
RPROVIDES:sudo-devel = "sudo-devel ( =  1.9.15-8.p5.el10_0.2) sudo-devel(x86-64) ( =  1.9.15-8.p5.el10_0.2)"
