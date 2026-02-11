
PN = "uid_wrapper"
PE = "0"
PV = "1.3.0"
PR = "8.el10"
PACKAGES = "uid_wrapper"


URI_uid_wrapper = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/uid_wrapper-1.3.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uid_wrapper = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) cmake-filesystem(x86-64) ( )"
RPROVIDES:uid_wrapper = "libuid_wrapper.so.0()(64bit) ( ) cmake(uid_wrapper) ( =  1.3.0) pkgconfig(uid_wrapper) ( =  1.3.0) uid_wrapper ( =  1.3.0-8.el10) uid_wrapper(x86-64) ( =  1.3.0-8.el10)"
