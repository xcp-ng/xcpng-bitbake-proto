
PN = "i2c-tools"
PE = "0"
PV = "4.3"
PR = "14.el10"
PACKAGES = "i2c-tools i2c-tools-perl libi2c python3-i2c-tools libi2c-devel"


URI_i2c-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/i2c-tools-4.3-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:i2c-tools = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) systemd-udev ( ) kmod ( ) libi2c.so.0()(64bit) ( ) libi2c(x86-64) ( =  4.3-14.el10)"
RPROVIDES:i2c-tools = "config(i2c-tools) ( =  4.3-14.el10) i2c-tools ( =  4.3-14.el10) i2c-tools(x86-64) ( =  4.3-14.el10)"

URI_i2c-tools-perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/i2c-tools-perl-4.3-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:i2c-tools-perl = "perl(strict) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(constant) ( ) perl(POSIX) ( ) perl(File::Basename) ( ) perl(Fcntl) ( ) perl(:VERSION) ( >=  5.4.0) libi2c(x86-64) ( =  4.3-14.el10)"
RPROVIDES:i2c-tools-perl = "i2c-tools-perl ( =  4.3-14.el10) i2c-tools-perl(x86-64) ( =  4.3-14.el10)"

URI_libi2c = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libi2c-4.3-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libi2c = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:libi2c = "libi2c.so.0()(64bit) ( ) libi2c(x86-64) ( =  4.3-14.el10) libi2c ( =  4.3-14.el10)"

URI_python3-i2c-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-i2c-tools-4.3-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-i2c-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libi2c.so.0()(64bit) ( ) python(abi) ( =  3.12) libi2c(x86-64) ( =  4.3-14.el10)"
RPROVIDES:python3-i2c-tools = "python-i2c-tools ( =  4.3-14.el10) python3-i2c-tools ( =  4.3-14.el10) python3-i2c-tools(x86-64) ( =  4.3-14.el10) python3.12-i2c-tools ( =  4.3-14.el10) python3.12dist(smbus) ( =  1.1) python3dist(smbus) ( =  1.1)"

URI_libi2c-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libi2c-devel-4.3-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libi2c-devel = "libi2c.so.0()(64bit) ( ) libi2c(x86-64) ( =  4.3-14.el10)"
RPROVIDES:libi2c-devel = "libi2c-devel ( =  4.3-14.el10) libi2c-devel(x86-64) ( =  4.3-14.el10)"
