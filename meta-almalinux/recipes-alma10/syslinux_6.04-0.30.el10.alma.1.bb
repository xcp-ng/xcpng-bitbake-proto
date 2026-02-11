
PN = "syslinux"
PE = "0"
PV = "6.04"
PR = "0.30.el10.alma.1"
PACKAGES = "syslinux syslinux-extlinux syslinux-extlinux-nonlinux syslinux-nonlinux syslinux-tftpboot syslinux-devel syslinux-efi64 syslinux-perl"


URI_syslinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/syslinux-6.04-0.30.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:syslinux = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) mtools ( ) syslinux-nonlinux ( =  6.04-0.30.el10.alma.1)"
RPROVIDES:syslinux = "syslinux ( =  6.04-0.30.el10.alma.1) syslinux(x86-64) ( =  6.04-0.30.el10.alma.1)"

URI_syslinux-extlinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/syslinux-extlinux-6.04-0.30.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:syslinux-extlinux = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) syslinux ( ) syslinux-extlinux-nonlinux ( =  6.04-0.30.el10.alma.1)"
RPROVIDES:syslinux-extlinux = "config(syslinux-extlinux) ( =  6.04-0.30.el10.alma.1) syslinux-extlinux ( =  6.04-0.30.el10.alma.1) syslinux-extlinux(x86-64) ( =  6.04-0.30.el10.alma.1)"

URI_syslinux-extlinux-nonlinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/syslinux-extlinux-nonlinux-6.04-0.30.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:syslinux-extlinux-nonlinux = "rtld(GNU_HASH) ( ) syslinux ( )"
RPROVIDES:syslinux-extlinux-nonlinux = "syslinux-extlinux-nonlinux ( =  6.04-0.30.el10.alma.1)"

URI_syslinux-nonlinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/syslinux-nonlinux-6.04-0.30.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:syslinux-nonlinux = "rtld(GNU_HASH) ( ) syslinux ( )"
RPROVIDES:syslinux-nonlinux = "syslinux-nonlinux ( =  6.04-0.30.el10.alma.1)"

URI_syslinux-tftpboot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/syslinux-tftpboot-6.04-0.30.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:syslinux-tftpboot = "rtld(GNU_HASH) ( )"
RPROVIDES:syslinux-tftpboot = "syslinux-tftpboot ( =  6.04-0.30.el10.alma.1)"

URI_syslinux-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/syslinux-devel-6.04-0.30.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:syslinux-devel = "rtld(GNU_HASH) ( )"
RPROVIDES:syslinux-devel = "syslinux-devel ( =  6.04-0.30.el10.alma.1) syslinux-devel(x86-64) ( =  6.04-0.30.el10.alma.1) syslinux-static ( =  6.04-0.30.el10.alma.1)"

URI_syslinux-efi64 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/syslinux-efi64-6.04-0.30.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:syslinux-efi64 = "rtld(GNU_HASH) ( )"
RPROVIDES:syslinux-efi64 = "syslinux-efi64 ( =  6.04-0.30.el10.alma.1) syslinux-efi64(x86-64) ( =  6.04-0.30.el10.alma.1)"

URI_syslinux-perl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/syslinux-perl-6.04-0.30.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:syslinux-perl = "/usr/bin/perl ( ) perl(Cwd) ( ) perl(IO::Handle) ( ) perl(Fcntl) ( ) perl(Socket) ( ) perl(bytes) ( ) perl(Errno) ( ) perl(MIME::Base64) ( ) perl(integer) ( ) perl(Digest::SHA) ( ) perl(Crypt::PasswdMD5) ( )"
RPROVIDES:syslinux-perl = "syslinux-perl ( =  6.04-0.30.el10.alma.1) syslinux-perl(x86-64) ( =  6.04-0.30.el10.alma.1)"
