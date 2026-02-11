
PN = "ruby"
PE = "0"
PV = "3.3.8"
PR = "10.el10_0"
PACKAGES = "ruby ruby-bundled-gems ruby-default-gems ruby-devel ruby-libs rubygem-bigdecimal rubygem-bundler rubygem-io-console rubygem-irb rubygem-json rubygem-minitest rubygem-power_assert rubygem-psych rubygem-racc rubygem-rake rubygem-rbs rubygem-rdoc rubygem-rexml rubygem-rss rubygem-test-unit rubygem-typeprof rubygems rubygems-devel ruby-doc"


URI_ruby = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ruby-3.3.8-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libruby.so.3.3()(64bit) ( ) libgmp.so.10()(64bit) ( ) ruby-libs(x86-64) ( =  3.3.8-10.el10_0)"
RPROVIDES:ruby = "ruby(x86-64) ( =  3.3.8-10.el10_0) ruby ( =  3.3.8-10.el10_0) ruby(runtime_executable) ( =  3.3.8)"

URI_ruby-bundled-gems = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ruby-bundled-gems-3.3.8-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby-bundled-gems = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) ruby(rubygems) ( ) /usr/bin/ruby ( ) libruby.so.3.3()(64bit) ( ) rubygem(date) ( ) rubygem(forwardable) ( ) rubygem(time) ( ) rubygem(net-protocol) ( ) rubygem(singleton) ( ) rubygem(irb) ( with  (REL)) rubygem(reline) ( >=  0.3.8)"
RPROVIDES:ruby-bundled-gems = "bundled(rubygem-debug) ( =  1.9.2) bundled(rubygem-matrix) ( =  0.4.2) bundled(rubygem-net-ftp) ( =  0.3.4) bundled(rubygem-net-pop) ( =  0.1.2) bundled(rubygem-prime) ( =  0.1.2) rubygem(debug) ( =  1.9.2) rubygem(matrix) ( =  0.4.2) rubygem(net-ftp) ( =  0.3.4) rubygem(net-pop) ( =  0.1.2) rubygem(prime) ( =  0.1.2) bundled(rubygem-net-imap) ( =  0.4.19) bundled(rubygem-net-smtp) ( =  0.5.1) ruby-bundled-gems ( =  3.3.8-10.el10_0) ruby-bundled-gems(x86-64) ( =  3.3.8-10.el10_0) rubygem(net-imap) ( =  0.4.19) rubygem(net-smtp) ( =  0.5.1)"

URI_ruby-default-gems = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ruby-default-gems-3.3.8-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ruby-default-gems = "ruby(rubygems) ( ) /usr/bin/ruby ( ) rubygem(date) ( ) rubygem(forwardable) ( ) rubygem(reline) ( ) rubygem(stringio) ( ) rubygem(time) ( ) rubygem(uri) ( ) rubygem(delegate) ( ) rubygem(drb) ( ) rubygem(fileutils) ( ) rubygem(ipaddr) ( ) rubygem(prettyprint) ( ) rubygem(resolv) ( ) rubygem(ruby2_keywords) ( ) rubygem(timeout) ( ) rubygem(io-console) ( with  (REL)) rubygem(cgi) ( >=  0.3.3)"
RPROVIDES:ruby-default-gems = "rubygem(abbrev) ( =  0.1.2) rubygem(base64) ( =  0.2.0) rubygem(benchmark) ( =  0.3.0) rubygem(csv) ( =  3.2.8) rubygem(date) ( =  3.3.4) rubygem(delegate) ( =  0.3.1) rubygem(did_you_mean) ( =  1.6.3) rubygem(digest) ( =  3.1.1) rubygem(drb) ( =  2.2.0) rubygem(english) ( =  0.8.0) rubygem(erb) ( =  4.0.3) rubygem(error_highlight) ( =  0.6.0) rubygem(etc) ( =  1.4.3) rubygem(fcntl) ( =  1.1.0) rubygem(fiddle) ( =  1.1.2) rubygem(fileutils) ( =  1.7.2) rubygem(find) ( =  0.2.0) rubygem(forwardable) ( =  1.3.3) rubygem(getoptlong) ( =  0.2.1) rubygem(io-nonblock) ( =  0.3.0) rubygem(io-wait) ( =  0.3.1) rubygem(ipaddr) ( =  1.2.6) rubygem(logger) ( =  1.6.0) rubygem(mutex_m) ( =  0.2.0) rubygem(net-http) ( =  0.4.1) rubygem(net-protocol) ( =  0.2.2) rubygem(nkf) ( =  0.1.3) rubygem(observer) ( =  0.1.2) rubygem(open-uri) ( =  0.4.1) rubygem(open3) ( =  0.2.1) rubygem(openssl) ( =  3.2.0) rubygem(optparse) ( =  0.4.0) rubygem(ostruct) ( =  0.6.0) rubygem(pathname) ( =  0.3.0) rubygem(pp) ( =  0.5.0) rubygem(prettyprint) ( =  0.2.0) rubygem(prism) ( =  0.19.0) rubygem(pstore) ( =  0.1.3) rubygem(readline) ( =  0.0.4) rubygem(reline) ( =  0.5.10) rubygem(resolv) ( =  0.3.0) rubygem(resolv-replace) ( =  0.1.1) rubygem(rinda) ( =  0.2.0) rubygem(ruby2_keywords) ( =  0.0.5) rubygem(securerandom) ( =  0.3.1) rubygem(set) ( =  1.1.0) rubygem(shellwords) ( =  0.2.0) rubygem(singleton) ( =  0.2.0) rubygem(stringio) ( =  3.1.1) rubygem(strscan) ( =  3.0.9) rubygem(syntax_suggest) ( =  2.0.1) rubygem(syslog) ( =  0.1.2) rubygem(tempfile) ( =  0.2.1) rubygem(time) ( =  0.3.0) rubygem(timeout) ( =  0.4.1) rubygem(tmpdir) ( =  0.2.0) rubygem(tsort) ( =  0.2.0) rubygem(un) ( =  0.3.0) rubygem(weakref) ( =  0.1.3) rubygem(yaml) ( =  0.3.0) rubygem(zlib) ( =  3.1.1) ruby-default-gems ( =  3.3.8-10.el10_0) rubygem(cgi) ( =  0.4.2) rubygem(uri) ( =  0.13.2)"

URI_ruby-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ruby-devel-3.3.8-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby-devel = "/usr/bin/pkg-config ( ) libruby.so.3.3()(64bit) ( ) rubygems ( ) ruby(x86-64) ( =  3.3.8-10.el10_0)"
RPROVIDES:ruby-devel = "rpm_macro(ruby_default_filter) ( ) rpm_macro(ruby_libarchdir) ( ) rpm_macro(ruby_libdir) ( ) rpm_macro(ruby_sitearchdir) ( ) rpm_macro(ruby_sitedir) ( ) rpm_macro(ruby_sitelibdir) ( ) rpm_macro(ruby_vendorarchdir) ( ) rpm_macro(ruby_vendordir) ( ) rpm_macro(ruby_vendorlibdir) ( ) pkgconfig(ruby) ( =  3.3.8) ruby-devel ( =  3.3.8-10.el10_0) ruby-devel(x86-64) ( =  3.3.8-10.el10_0)"

URI_ruby-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ruby-libs-3.3.8-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libgmp.so.10()(64bit) ( ) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) ( ) libz.so.1(ZLIB_1.2.2)(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.2.5)(64bit) ( ) libz.so.1(ZLIB_1.2.9)(64bit) ( )"
RPROVIDES:ruby-libs = "libruby.so.3.3()(64bit) ( ) bundled(ccan-build_assert) ( ) bundled(ccan-check_type) ( ) bundled(ccan-container_of) ( ) bundled(ccan-list) ( ) ruby-libs(x86-64) ( =  3.3.8-10.el10_0) bundled(nkf) ( =  2.1.5) bundled(rubygem-did_you_mean) ( =  1.6.3) bundled(rubygem-openssl) ( =  3.2.0) ruby(release) ( =  3.3.8) ruby-libs ( =  3.3.8-10.el10_0)"

URI_rubygem-bigdecimal = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-bigdecimal-3.1.5-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-bigdecimal = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) ruby(rubygems) ( ) libruby.so.3.3()(64bit) ( )"
RPROVIDES:rubygem-bigdecimal = "bundled(rubygem-bigdecimal) ( =  3.1.5) rubygem(bigdecimal) ( =  3.1.5) rubygem-bigdecimal ( =  3.1.5-10.el10_0) rubygem-bigdecimal(x86-64) ( =  3.1.5-10.el10_0)"

URI_rubygem-bundler = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-bundler-2.5.22-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-bundler = "/usr/bin/ruby ( ) rubygem(io-console) ( ) ruby(rubygems) ( >=  3.2.3)"
RPROVIDES:rubygem-bundler = "bundled(rubygem-securerandom) ( =  0.3.1) bundled(rubygem-bundler) ( =  2.5.22) bundled(rubygem-connection_pool) ( =  2.4.1) bundled(rubygem-fileutils) ( =  1.7.2) bundled(rubygem-net-http-persistent) ( =  4.0.4) bundled(rubygem-pub_grub) ( =  0.5.0) bundled(rubygem-thor) ( =  1.3.0) bundled(rubygem-uri) ( =  0.13.1) rubygem(bundler) ( =  2.5.22) rubygem-bundler ( =  2.5.22-10.el10_0)"

URI_rubygem-io-console = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-io-console-0.7.1-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-io-console = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) ruby(rubygems) ( ) libruby.so.3.3()(64bit) ( )"
RPROVIDES:rubygem-io-console = "bundled(rubygem-io-console) ( =  0.7.1) rubygem(io-console) ( =  0.7.1) rubygem-io-console ( =  0.7.1-10.el10_0) rubygem-io-console(x86-64) ( =  0.7.1-10.el10_0)"

URI_rubygem-irb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-irb-1.13.1-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-irb = "ruby(rubygems) ( ) /usr/bin/ruby ( ) rubygem(rdoc) ( >=  4.0.0) rubygem(reline) ( >=  0.4.2)"
RPROVIDES:rubygem-irb = "bundled(rubygem-irb) ( =  1.13.1) rubygem(irb) ( =  1.13.1) irb ( =  1.13.1-10.el10_0) ruby(irb) ( =  3.3.8-10.el10_0) ruby-irb ( =  3.3.8-10.el10_0) rubygem-irb ( =  1.13.1-10.el10_0)"

URI_rubygem-json = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-json-2.7.2-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-json = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) ruby(rubygems) ( ) libruby.so.3.3()(64bit) ( )"
RPROVIDES:rubygem-json = "bundled(rubygem-json) ( =  2.7.2) rubygem(json) ( =  2.7.2) rubygem-json ( =  2.7.2-10.el10_0) rubygem-json(x86-64) ( =  2.7.2-10.el10_0)"

URI_rubygem-minitest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-minitest-5.20.0-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-minitest = "ruby(rubygems) ( )"
RPROVIDES:rubygem-minitest = "bundled(rubygem-minitest) ( =  5.20.0) rubygem(minitest) ( =  5.20.0) rubygem-minitest ( =  5.20.0-10.el10_0)"

URI_rubygem-power_assert = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-power_assert-2.0.3-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-power_assert = "ruby(rubygems) ( )"
RPROVIDES:rubygem-power_assert = "bundled(rubygem-power_assert) ( =  2.0.3) rubygem(power_assert) ( =  2.0.3) rubygem-power_assert ( =  2.0.3-10.el10_0)"

URI_rubygem-psych = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-psych-5.1.2-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-psych = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) ruby(rubygems) ( ) libruby.so.3.3()(64bit) ( ) libyaml-0.so.2()(64bit) ( ) rubygem(stringio) ( )"
RPROVIDES:rubygem-psych = "bundled(rubygem-psych) ( =  5.1.2) rubygem(psych) ( =  5.1.2) rubygem-psych ( =  5.1.2-10.el10_0) rubygem-psych(x86-64) ( =  5.1.2-10.el10_0)"

URI_rubygem-racc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-racc-1.7.3-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-racc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) ruby(rubygems) ( ) /usr/bin/ruby ( ) libruby.so.3.3()(64bit) ( )"
RPROVIDES:rubygem-racc = "bundled(rubygem-racc) ( =  1.7.3) rubygem(racc) ( =  1.7.3) rubygem-racc ( =  1.7.3-10.el10_0) rubygem-racc(x86-64) ( =  1.7.3-10.el10_0)"

URI_rubygem-rake = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-rake-13.1.0-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rake = "ruby(rubygems) ( ) /usr/bin/ruby ( )"
RPROVIDES:rubygem-rake = "bundled(rubygem-rake) ( =  13.1.0) rubygem(rake) ( =  13.1.0) rake ( =  13.1.0-10.el10_0) rubygem-rake ( =  13.1.0-10.el10_0)"

URI_rubygem-rbs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-rbs-3.4.0-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-rbs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) ruby(rubygems) ( ) /usr/bin/ruby ( ) libruby.so.3.3()(64bit) ( ) rubygem(abbrev) ( )"
RPROVIDES:rubygem-rbs = "bundled(rubygem-rbs) ( =  3.4.0) rubygem(rbs) ( =  3.4.0) rubygem-rbs ( =  3.4.0-10.el10_0) rubygem-rbs(x86-64) ( =  3.4.0-10.el10_0)"

URI_rubygem-rdoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-rdoc-6.6.3.1-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rdoc = "/usr/bin/ruby ( ) rubygem(io-console) ( ) rubygem(json) ( >=  2.7.2) ruby(rubygems) ( >=  2.2) rubygem(psych) ( >=  4.0.0)"
RPROVIDES:rubygem-rdoc = "bundled(rubygem-rdoc) ( =  6.6.3.1) rubygem(rdoc) ( =  6.6.3.1) rdoc ( =  6.6.3.1-10.el10_0) ri ( =  6.6.3.1-10.el10_0) rubygem-rdoc ( =  6.6.3.1-10.el10_0)"

URI_rubygem-rexml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-rexml-3.3.9-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rexml = "ruby(rubygems) ( )"
RPROVIDES:rubygem-rexml = "bundled(rubygem-rexml) ( =  3.3.9) rubygem(rexml) ( =  3.3.9) rubygem-rexml ( =  3.3.9-10.el10_0)"

URI_rubygem-rss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-rss-0.3.1-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rss = "ruby(rubygems) ( ) rubygem(rexml) ( )"
RPROVIDES:rubygem-rss = "bundled(rubygem-rss) ( =  0.3.1) rubygem(rss) ( =  0.3.1) rubygem-rss ( =  0.3.1-10.el10_0)"

URI_rubygem-test-unit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-test-unit-3.6.1-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-test-unit = "ruby(rubygems) ( ) rubygem(power_assert) ( )"
RPROVIDES:rubygem-test-unit = "bundled(rubygem-test-unit) ( =  3.6.1) rubygem(test-unit) ( =  3.6.1) rubygem-test-unit ( =  3.6.1-10.el10_0)"

URI_rubygem-typeprof = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-typeprof-0.21.9-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-typeprof = "ruby(rubygems) ( ) /usr/bin/ruby ( ) rubygem(rbs) ( >=  1.8.1)"
RPROVIDES:rubygem-typeprof = "bundled(rubygem-typeprof) ( =  0.21.9) rubygem(typeprof) ( =  0.21.9) rubygem-typeprof ( =  0.21.9-10.el10_0)"

URI_rubygems = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygems-3.5.22-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygems = "/usr/bin/ruby ( ) ruby(release) ( ) rubygem(psych) ( >=  5.1.2)"
RPROVIDES:rubygems = "bundled(rubygem-securerandom) ( =  0.3.1) bundled(rubygem-molinillo) ( =  0.8.0) bundled(rubygem-net-http) ( =  0.4.1) bundled(rubygem-net-protocol) ( =  0.2.2) bundled(rubygem-optparse) ( =  0.4.0) bundled(rubygem-resolv) ( =  0.4.0) bundled(rubygem-timeout) ( =  0.4.1) bundled(rubygem-tsort) ( =  0.2.0) bundled(rubygems) ( =  3.5.22) gem ( =  3.5.22-10.el10_0) ruby(rubygems) ( =  3.5.22-10.el10_0) rubygems ( =  3.5.22-10.el10_0)"

URI_rubygems-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygems-devel-3.5.22-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygems-devel = "/usr/bin/ruby ( ) rubygem(json) ( >=  2.7.2) rubygem(rdoc) ( >=  6.6.3.1) ruby(rubygems) ( >=  3.5.22-10.el10_0)"
RPROVIDES:rubygems-devel = "rpm_macro(gem_archdir) ( ) rpm_macro(gem_cache) ( ) rpm_macro(gem_dir) ( ) rpm_macro(gem_docdir) ( ) rpm_macro(gem_extdir_mri) ( ) rpm_macro(gem_install) ( ) rpm_macro(gem_instdir) ( ) rpm_macro(gem_libdir) ( ) rpm_macro(gem_name_version) ( ) rpm_macro(gem_plugin) ( ) rpm_macro(gem_spec) ( ) rpm_macro(gemspec_add_dep) ( ) rpm_macro(gemspec_add_file) ( ) rpm_macro(gemspec_remove_dep) ( ) rpm_macro(gemspec_remove_file) ( ) rubygems-devel ( =  3.5.22-10.el10_0)"

URI_ruby-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ruby-doc-3.3.8-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ruby-doc = "/usr/bin/ri ( )"
RPROVIDES:ruby-doc = "ruby-doc ( =  3.3.8-10.el10_0)"
