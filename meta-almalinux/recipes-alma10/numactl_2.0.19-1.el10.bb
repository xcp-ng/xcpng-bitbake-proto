
PN = "numactl"
PE = "0"
PV = "2.0.19"
PR = "1.el10"
PACKAGES = "numactl numactl-libs numactl-devel"


URI_numactl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/numactl-2.0.19-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:numactl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libnuma.so.1()(64bit) ( ) libnuma.so.1(libnuma_1.1)(64bit) ( ) libnuma.so.1(libnuma_1.2)(64bit) ( ) libnuma.so.1(libnuma_1.3)(64bit) ( ) libnuma.so.1(libnuma_1.4)(64bit) ( ) libnuma.so.1(libnuma_1.5)(64bit) ( ) libnuma.so.1(libnuma_1.6)(64bit) ( ) libnuma.so.1(libnuma_2.1)(64bit) ( )"
RPROVIDES:numactl = "numactl ( =  2.0.19-1.el10) numactl(x86-64) ( =  2.0.19-1.el10)"

URI_numactl-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/numactl-libs-2.0.19-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:numactl-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:numactl-libs = "libnuma.so.1()(64bit) ( ) libnuma.so.1(libnuma_1.1)(64bit) ( ) libnuma.so.1(libnuma_1.2)(64bit) ( ) libnuma.so.1(libnuma_1.3)(64bit) ( ) libnuma.so.1(libnuma_1.4)(64bit) ( ) libnuma.so.1(libnuma_1.5)(64bit) ( ) libnuma.so.1(libnuma_1.6)(64bit) ( ) libnuma.so.1(libnuma_2.1)(64bit) ( ) libnuma.so.1(libnuma_1.7)(64bit) ( ) numactl-libs ( =  2.0.19-1.el10) numactl-libs(x86-64) ( =  2.0.19-1.el10)"

URI_numactl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/numactl-devel-2.0.19-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:numactl-devel = "/usr/bin/pkg-config ( ) libnuma.so.1()(64bit) ( ) numactl-libs ( =  2.0.19-1.el10)"
RPROVIDES:numactl-devel = "numactl-devel ( =  2.0.19-1.el10) numactl-devel(x86-64) ( =  2.0.19-1.el10) pkgconfig(numa) ( =  2.0.19)"
