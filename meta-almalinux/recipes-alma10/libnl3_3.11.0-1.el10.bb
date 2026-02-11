
PN = "libnl3"
PE = "0"
PV = "3.11.0"
PR = "1.el10"
PACKAGES = "libnl3 libnl3-cli libnl3-devel libnl3-doc"


URI_libnl3 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnl3-3.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnl3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( )"
RPROVIDES:libnl3 = "libnl-3.so.200()(64bit) ( ) libnl-3.so.200(libnl_3)(64bit) ( ) libnl-genl-3.so.200()(64bit) ( ) libnl-genl-3.so.200(libnl_3)(64bit) ( ) libnl-route-3.so.200()(64bit) ( ) libnl-route-3.so.200(libnl_3)(64bit) ( ) libnl-3.so.200(libnl_3_2_27)(64bit) ( ) libnl-route-3.so.200(libnl_3_2_28)(64bit) ( ) libnl-idiag-3.so.200()(64bit) ( ) libnl-idiag-3.so.200(libnl_3)(64bit) ( ) libnl-nf-3.so.200()(64bit) ( ) libnl-nf-3.so.200(libnl_3)(64bit) ( ) libnl-route-3.so.200(libnl_3_4)(64bit) ( ) libnl-route-3.so.200(libnl_3_6)(64bit) ( ) libnl-route-3.so.200(libnl_3_8)(64bit) ( ) libnl-3.so.200(libnl_3_10)(64bit) ( ) libnl-3.so.200(libnl_3_11)(64bit) ( ) libnl-3.so.200(libnl_3_2_26)(64bit) ( ) libnl-3.so.200(libnl_3_2_28)(64bit) ( ) libnl-3.so.200(libnl_3_2_29)(64bit) ( ) libnl-3.so.200(libnl_3_5)(64bit) ( ) libnl-3.so.200(libnl_3_6)(64bit) ( ) libnl-nf-3.so.200(libnl_3_6)(64bit) ( ) libnl-route-3.so.200(libnl_3_10)(64bit) ( ) libnl-route-3.so.200(libnl_3_11)(64bit) ( ) libnl-route-3.so.200(libnl_3_2_26)(64bit) ( ) libnl-route-3.so.200(libnl_3_2_27)(64bit) ( ) libnl-route-3.so.200(libnl_3_2_29)(64bit) ( ) libnl-route-3.so.200(libnl_3_5)(64bit) ( ) libnl-route-3.so.200(libnl_3_7)(64bit) ( ) libnl-route-3.so.200(libnl_3_9)(64bit) ( ) libnl-xfrm-3.so.200()(64bit) ( ) libnl-xfrm-3.so.200(libnl_3)(64bit) ( ) libnl-xfrm-3.so.200(libnl_3_6)(64bit) ( ) libnl3 ( =  3.11.0-1.el10) config(libnl3) ( =  3.11.0-1.el10) libnl3(x86-64) ( =  3.11.0-1.el10)"

URI_libnl3-cli = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnl3-cli-3.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnl3-cli = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libnl-3.so.200()(64bit) ( ) libnl-3.so.200(libnl_3)(64bit) ( ) libnl-genl-3.so.200()(64bit) ( ) libnl-genl-3.so.200(libnl_3)(64bit) ( ) libnl-route-3.so.200()(64bit) ( ) libnl-route-3.so.200(libnl_3)(64bit) ( ) libnl-route-3.so.200(libnl_3_2_28)(64bit) ( ) libnl-idiag-3.so.200()(64bit) ( ) libnl-idiag-3.so.200(libnl_3)(64bit) ( ) libnl-nf-3.so.200()(64bit) ( ) libnl-nf-3.so.200(libnl_3)(64bit) ( ) libnl-route-3.so.200(libnl_3_4)(64bit) ( ) libnl-route-3.so.200(libnl_3_8)(64bit) ( ) libnl3 ( =  3.11.0-1.el10)"
RPROVIDES:libnl3-cli = "libnl-cli-3.so.200()(64bit) ( ) libnl-cli-3.so.200(libnl_3)(64bit) ( ) libnl-cli-3.so.200(libnl_3_2_28)(64bit) ( ) libnl-cli-3.so.200(libnl_3_8)(64bit) ( ) libnl3-cli ( =  3.11.0-1.el10) libnl3-cli(x86-64) ( =  3.11.0-1.el10)"

URI_libnl3-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnl3-devel-3.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnl3-devel = "/usr/bin/pkg-config ( ) kernel-headers ( ) libnl-3.so.200()(64bit) ( ) libnl-genl-3.so.200()(64bit) ( ) libnl-route-3.so.200()(64bit) ( ) pkgconfig(libnl-3.0) ( ) pkgconfig(libnl-genl-3.0) ( ) pkgconfig(libnl-nf-3.0) ( ) pkgconfig(libnl-route-3.0) ( ) libnl-cli-3.so.200()(64bit) ( ) libnl-idiag-3.so.200()(64bit) ( ) libnl-nf-3.so.200()(64bit) ( ) libnl-xfrm-3.so.200()(64bit) ( ) libnl3 ( =  3.11.0-1.el10) libnl3-cli ( =  3.11.0-1.el10)"
RPROVIDES:libnl3-devel = "libnl3-devel ( =  3.11.0-1.el10) libnl3-devel(x86-64) ( =  3.11.0-1.el10) pkgconfig(libnl-3.0) ( =  3.11.0) pkgconfig(libnl-cli-3.0) ( =  3.11.0) pkgconfig(libnl-genl-3.0) ( =  3.11.0) pkgconfig(libnl-idiag-3.0) ( =  3.11.0) pkgconfig(libnl-nf-3.0) ( =  3.11.0) pkgconfig(libnl-route-3.0) ( =  3.11.0) pkgconfig(libnl-xfrm-3.0) ( =  3.11.0)"

URI_libnl3-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnl3-doc-3.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnl3-doc = "libnl3 ( =  3.11.0-1.el10)"
RPROVIDES:libnl3-doc = "libnl3-doc ( =  3.11.0-1.el10) libnl3-doc(x86-64) ( =  3.11.0-1.el10)"
