
PN = "nbdkit"
PE = "0"
PV = "1.40.4"
PR = "4.el10_0"
PACKAGES = "nbdkit nbdkit-bash-completion nbdkit-basic-filters nbdkit-basic-plugins nbdkit-curl-plugin nbdkit-linuxdisk-plugin nbdkit-nbd-plugin nbdkit-python-plugin nbdkit-selinux nbdkit-server nbdkit-ssh-plugin nbdkit-tar-filter nbdkit-tmpdisk-plugin nbdkit-vddk-plugin nbdkit-xz-filter nbdkit-devel nbdkit-example-plugins nbdkit-srpm-macros nbdkit-blkio-plugin nbdkit-bzip2-filter nbdkit-stats-filter"


URI_nbdkit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit = "nbdkit-server(x86-64) ( =  1.40.4-4.el10_0) nbdkit-selinux ( if  selinux-policy-targeted) nbdkit-basic-filters(x86-64) ( =  1.40.4-4.el10_0) nbdkit-basic-plugins(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit = "nbdkit ( =  1.40.4-4.el10_0) nbdkit(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-bash-completion = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-bash-completion-1.40.4-4.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nbdkit-bash-completion = "bash-completion ( >=  2.0) nbdkit-server ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-bash-completion = "nbdkit-bash-completion ( =  1.40.4-4.el10_0)"

URI_nbdkit-basic-filters = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-basic-filters-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-basic-filters = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libz.so.1()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_13)(64bit) ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-basic-filters = "Provides: ( ) nbdkit-basic-filters(x86-64) ( =  1.40.4-4.el10_0) nbdkit-basic-filters ( =  1.40.4-4.el10_0) nbdkit-blocksize-filter ( =  1.40.4-4.el10_0) nbdkit-blocksize-policy-filter ( =  1.40.4-4.el10_0) nbdkit-cache-filter ( =  1.40.4-4.el10_0) nbdkit-cacheextents-filter ( =  1.40.4-4.el10_0) nbdkit-checkwrite-filter ( =  1.40.4-4.el10_0) nbdkit-cow-filter ( =  1.40.4-4.el10_0) nbdkit-ddrescue-filter ( =  1.40.4-4.el10_0) nbdkit-delay-filter ( =  1.40.4-4.el10_0) nbdkit-error-filter ( =  1.40.4-4.el10_0) nbdkit-evil-filter ( =  1.40.4-4.el10_0) nbdkit-exitlast-filter ( =  1.40.4-4.el10_0) nbdkit-exitwhen-filter ( =  1.40.4-4.el10_0) nbdkit-exportname-filter ( =  1.40.4-4.el10_0) nbdkit-extentlist-filter ( =  1.40.4-4.el10_0) nbdkit-fua-filter ( =  1.40.4-4.el10_0) nbdkit-gzip-filter ( =  1.40.4-4.el10_0) nbdkit-ip-filter ( =  1.40.4-4.el10_0) nbdkit-limit-filter ( =  1.40.4-4.el10_0) nbdkit-log-filter ( =  1.40.4-4.el10_0) nbdkit-luks-filter ( =  1.40.4-4.el10_0) nbdkit-multi-conn-filter ( =  1.40.4-4.el10_0) nbdkit-nocache-filter ( =  1.40.4-4.el10_0) nbdkit-noextents-filter ( =  1.40.4-4.el10_0) nbdkit-nofilter-filter ( =  1.40.4-4.el10_0) nbdkit-noparallel-filter ( =  1.40.4-4.el10_0) nbdkit-nozero-filter ( =  1.40.4-4.el10_0) nbdkit-offset-filter ( =  1.40.4-4.el10_0) nbdkit-partition-filter ( =  1.40.4-4.el10_0) nbdkit-pause-filter ( =  1.40.4-4.el10_0) nbdkit-protect-filter ( =  1.40.4-4.el10_0) nbdkit-rate-filter ( =  1.40.4-4.el10_0) nbdkit-readahead-filter ( =  1.40.4-4.el10_0) nbdkit-readonly-filter ( =  1.40.4-4.el10_0) nbdkit-retry-filter ( =  1.40.4-4.el10_0) nbdkit-retry-request-filter ( =  1.40.4-4.el10_0) nbdkit-rotational-filter ( =  1.40.4-4.el10_0) nbdkit-scan-filter ( =  1.40.4-4.el10_0) nbdkit-spinning-filter ( =  1.40.4-4.el10_0) nbdkit-swab-filter ( =  1.40.4-4.el10_0) nbdkit-tls-fallback-filter ( =  1.40.4-4.el10_0) nbdkit-truncate-filter ( =  1.40.4-4.el10_0)"

URI_nbdkit-basic-plugins = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-basic-plugins-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-basic-plugins = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libzstd.so.1()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_0)(64bit) ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-basic-plugins = "Provides: ( ) nbdkit-basic-plugins(x86-64) ( =  1.40.4-4.el10_0) nbdkit-basic-plugins ( =  1.40.4-4.el10_0) nbdkit-data-plugin ( =  1.40.4-4.el10_0) nbdkit-eval-plugin ( =  1.40.4-4.el10_0) nbdkit-file-plugin ( =  1.40.4-4.el10_0) nbdkit-floppy-plugin ( =  1.40.4-4.el10_0) nbdkit-full-plugin ( =  1.40.4-4.el10_0) nbdkit-info-plugin ( =  1.40.4-4.el10_0) nbdkit-memory-plugin ( =  1.40.4-4.el10_0) nbdkit-ondemand-plugin ( =  1.40.4-4.el10_0) nbdkit-ones-plugin ( =  1.40.4-4.el10_0) nbdkit-partitioning-plugin ( =  1.40.4-4.el10_0) nbdkit-pattern-plugin ( =  1.40.4-4.el10_0) nbdkit-random-plugin ( =  1.40.4-4.el10_0) nbdkit-sh-plugin ( =  1.40.4-4.el10_0) nbdkit-sparse-random-plugin ( =  1.40.4-4.el10_0) nbdkit-split-plugin ( =  1.40.4-4.el10_0) nbdkit-zero-plugin ( =  1.40.4-4.el10_0)"

URI_nbdkit-curl-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-curl-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-curl-plugin = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcurl.so.4()(64bit) ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-curl-plugin = "Provides: ( ) nbdkit-curl-plugin ( =  1.40.4-4.el10_0) nbdkit-curl-plugin(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-linuxdisk-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-linuxdisk-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-linuxdisk-plugin = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) e2fsprogs ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-linuxdisk-plugin = "Provides: ( ) nbdkit-linuxdisk-plugin ( =  1.40.4-4.el10_0) nbdkit-linuxdisk-plugin(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-nbd-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-nbd-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-nbd-plugin = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libnbd.so.0()(64bit) ( ) libnbd.so.0(LIBNBD_1.0)(64bit) ( ) libnbd.so.0(LIBNBD_1.2)(64bit) ( ) libnbd.so.0(LIBNBD_1.12)(64bit) ( ) libnbd.so.0(LIBNBD_1.4)(64bit) ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-nbd-plugin = "Provides: ( ) nbdkit-nbd-plugin ( =  1.40.4-4.el10_0) nbdkit-nbd-plugin(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-python-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-python-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-python-plugin = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-python-plugin = "Provides: ( ) nbdkit-python-plugin ( =  1.40.4-4.el10_0) nbdkit-python-plugin(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-selinux-1.40.4-4.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nbdkit-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.26) selinux-policy ( >=  40.13.26)"
RPROVIDES:nbdkit-selinux = "nbdkit-selinux ( =  1.40.4-4.el10_0)"

URI_nbdkit-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-server-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-server = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_0)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_3)(64bit) ( )"
RPROVIDES:nbdkit-server = "Provides: ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0) nbdkit-server ( =  1.40.4-4.el10_0) nbdkit-null-plugin ( =  1.40.4-4.el10_0)"

URI_nbdkit-ssh-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-ssh-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-ssh-plugin = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libssh.so.4()(64bit) ( ) libssh.so.4(LIBSSH_4_5_0)(64bit) ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-ssh-plugin = "Provides: ( ) nbdkit-ssh-plugin ( =  1.40.4-4.el10_0) nbdkit-ssh-plugin(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-tar-filter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-tar-filter-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-tar-filter = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) tar ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-tar-filter = "Provides: ( ) nbdkit-tar-filter ( =  1.40.4-4.el10_0) nbdkit-tar-filter(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-tmpdisk-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-tmpdisk-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-tmpdisk-plugin = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) util-linux ( ) e2fsprogs ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-tmpdisk-plugin = "Provides: ( ) nbdkit-tmpdisk-plugin ( =  1.40.4-4.el10_0) nbdkit-tmpdisk-plugin(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-vddk-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-vddk-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-vddk-plugin = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libxcrypt-compat ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-vddk-plugin = "Provides: ( ) nbdkit-vddk-plugin ( =  1.40.4-4.el10_0) nbdkit-vddk-plugin(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-xz-filter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-xz-filter-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-xz-filter = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-xz-filter = "Provides: ( ) nbdkit-xz-filter ( =  1.40.4-4.el10_0) nbdkit-xz-filter(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nbdkit-devel-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-devel = "pkgconfig(nbdkit) ( =  1.40.4) nbdkit-devel ( =  1.40.4-4.el10_0) nbdkit-devel(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-example-plugins = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nbdkit-example-plugins-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-example-plugins = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-example-plugins = "Provides: ( ) nbdkit-example-plugins ( =  1.40.4-4.el10_0) nbdkit-example-plugins(x86-64) ( =  1.40.4-4.el10_0) nbdkit-example1-plugin ( =  1.40.4-4.el10_0) nbdkit-example2-plugin ( =  1.40.4-4.el10_0) nbdkit-example3-plugin ( =  1.40.4-4.el10_0)"

URI_nbdkit-srpm-macros = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nbdkit-srpm-macros-1.40.4-4.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nbdkit-srpm-macros = "/usr/bin/bash ( )"
RPROVIDES:nbdkit-srpm-macros = "nbdkit-srpm-macros ( =  1.40.4-4.el10_0)"

URI_nbdkit-blkio-plugin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nbdkit-blkio-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-blkio-plugin = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libblkio.so.1()(64bit) ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-blkio-plugin = "Provides: ( ) nbdkit-blkio-plugin ( =  1.40.4-4.el10_0) nbdkit-blkio-plugin(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-bzip2-filter = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nbdkit-bzip2-filter-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-bzip2-filter = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libbz2.so.1()(64bit) ( ) libc.so.6(GLIBC_2.7)(64bit) ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-bzip2-filter = "Provides: ( ) nbdkit-bzip2-filter ( =  1.40.4-4.el10_0) nbdkit-bzip2-filter(x86-64) ( =  1.40.4-4.el10_0)"

URI_nbdkit-stats-filter = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nbdkit-stats-filter-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-stats-filter = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libc.so.6(GLIBC_2.8)(64bit) ( ) nbdkit-server(x86-64) ( =  1.40.4-4.el10_0)"
RPROVIDES:nbdkit-stats-filter = "Provides: ( ) nbdkit-stats-filter ( =  1.40.4-4.el10_0) nbdkit-stats-filter(x86-64) ( =  1.40.4-4.el10_0)"
