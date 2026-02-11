
PN = "rust-zram-generator"
PE = "0"
PV = "1.1.2"
PR = "14.el10"
PACKAGES = "zram-generator zram-generator-defaults"


URI_zram-generator = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/zram-generator-1.1.2-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zram-generator = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libc.so.6(GLIBC_2.39)(64bit) ( )"
RPROVIDES:zram-generator = "bundled(crate(cfg-if)) ( =  1.0.0) bundled(crate(rand_chacha)) ( =  0.3.1) bundled(crate(textwrap)) ( =  0.11.0) bundled(crate(ahash)) ( =  0.4.7) bundled(crate(anyhow)) ( =  1.0.45) bundled(crate(bitflags)) ( =  1.2.1) bundled(crate(clap)) ( =  2.33.3) bundled(crate(dlv-list)) ( =  0.2.3) bundled(crate(fasteval)) ( =  0.2.4) bundled(crate(getrandom)) ( =  0.2.3) bundled(crate(hashbrown)) ( =  0.9.1) bundled(crate(libc)) ( =  0.2.107) bundled(crate(liboverdrop)) ( =  0.0.2) bundled(crate(log)) ( =  0.4.14) bundled(crate(ordered-multimap)) ( =  0.3.1) bundled(crate(ppv-lite86)) ( =  0.2.15) bundled(crate(rand)) ( =  0.8.4) bundled(crate(rand_core)) ( =  0.6.3) bundled(crate(rust-ini)) ( =  0.17.0) bundled(crate(unicode-width)) ( =  0.1.9) zram-generator ( =  1.1.2-14.el10) zram-generator(x86-64) ( =  1.1.2-14.el10)"

URI_zram-generator-defaults = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/zram-generator-defaults-1.1.2-14.el10.noarch.rpm;unpack=0"
RDEPENDS:zram-generator-defaults = "zram-generator ( =  1.1.2-14.el10)"
RPROVIDES:zram-generator-defaults = "zram-generator-defaults ( =  1.1.2-14.el10)"
