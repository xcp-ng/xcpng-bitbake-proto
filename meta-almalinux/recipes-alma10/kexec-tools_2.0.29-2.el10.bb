
PN = "kexec-tools"
PE = "0"
PV = "2.0.29"
PR = "2.el10"
PACKAGES = "kexec-tools"


URI_kexec-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kexec-tools-2.0.29-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kexec-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libz.so.1(ZLIB_1.2.2.3)(64bit) ( )"
RPROVIDES:kexec-tools = "kexec-tools ( =  2.0.29-2.el10) kexec-tools(x86-64) ( =  2.0.29-2.el10)"
