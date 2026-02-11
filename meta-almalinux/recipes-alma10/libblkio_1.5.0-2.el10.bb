
PN = "libblkio"
PE = "0"
PV = "1.5.0"
PR = "2.el10"
PACKAGES = "libblkio libblkio-devel"


URI_libblkio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblkio-1.5.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblkio = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( )"
RPROVIDES:libblkio = "libblkio.so.1()(64bit) ( ) bundled(crate(bitflags)) ( =  1.3.2) bundled(crate(autocfg)) ( =  1.1.0) bundled(crate(lazy_static)) ( =  1.4.0) bundled(crate(bitflags)) ( =  2.5.0) bundled(crate(libc)) ( =  0.2.153) bundled(crate(paste)) ( =  1.0.14) bundled(crate(linux-raw-sys)) ( =  0.4.13) bundled(crate(memmap2)) ( =  0.9.4) bundled(crate(rustix)) ( =  0.38.34) bundled(crate(io-uring)) ( =  0.6.0) bundled(crate(num-traits)) ( =  0.2.16) bundled(crate(pci-driver)) ( =  0.1.4) bundled(crate(virtio-bindings)) ( =  0.2.1) libblkio ( =  1.5.0-2.el10) libblkio(x86-64) ( =  1.5.0-2.el10)"

URI_libblkio-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libblkio-devel-1.5.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblkio-devel = "/usr/bin/pkg-config ( ) libblkio.so.1()(64bit) ( ) libblkio(x86-64) ( =  1.5.0-2.el10)"
RPROVIDES:libblkio-devel = "libblkio-devel ( =  1.5.0-2.el10) libblkio-devel(x86-64) ( =  1.5.0-2.el10) pkgconfig(blkio) ( =  1.5.0)"
