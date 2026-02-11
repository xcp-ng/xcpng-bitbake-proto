
PN = "ruby"
PE = "0"
PV = "3.3.8"
PR = "10.el10_0"
PACKAGES = "ruby ruby-bundled-gems ruby-default-gems ruby-devel ruby-libs rubygem-bigdecimal rubygem-bundler rubygem-io-console rubygem-irb rubygem-json rubygem-minitest rubygem-power_assert rubygem-psych rubygem-racc rubygem-rake rubygem-rbs rubygem-rdoc rubygem-rexml rubygem-rss rubygem-test-unit rubygem-typeprof rubygems rubygems-devel ruby-doc"


URI_ruby = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ruby-3.3.8-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby = " \
 gmp \
 zlib-ng-compat \
 libxcrypt \
 ruby-libs \
 glibc \
"

URI_ruby-bundled-gems = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ruby-bundled-gems-3.3.8-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby-bundled-gems = " \
 ruby \
 ruby-default-gems \
 rubygems \
 ruby-libs \
 glibc \
 rubygem-irb \
"

URI_ruby-default-gems = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ruby-default-gems-3.3.8-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ruby-default-gems = " \
 rubygems \
 ruby-default-gems \
 rubygem-io-console \
 ruby \
"

URI_ruby-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ruby-devel-3.3.8-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby-devel = " \
 rubygems \
 ruby \
 ruby-libs \
 pkgconf-pkg-config \
"

URI_ruby-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ruby-libs-3.3.8-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby-libs = " \
 gmp \
 zlib-ng-compat \
 libffi \
 libxcrypt \
 openssl-libs \
 libgcc \
 glibc \
"

URI_rubygem-bigdecimal = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-bigdecimal-3.1.5-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-bigdecimal = " \
 glibc \
 rubygems \
 ruby-libs \
"

URI_rubygem-bundler = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-bundler-2.5.22-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-bundler = " \
 rubygems \
 rubygem-io-console \
 ruby \
"

URI_rubygem-io-console = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-io-console-0.7.1-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-io-console = " \
 glibc \
 rubygems \
 ruby-libs \
"

URI_rubygem-irb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-irb-1.13.1-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-irb = " \
 rubygems \
 ruby-default-gems \
 ruby \
 rubygem-rdoc \
"

URI_rubygem-json = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-json-2.7.2-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-json = " \
 glibc \
 rubygems \
 ruby-libs \
"

URI_rubygem-minitest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-minitest-5.20.0-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-minitest = " \
 rubygems \
"

URI_rubygem-power_assert = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-power_assert-2.0.3-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-power_assert = " \
 rubygems \
"

URI_rubygem-psych = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-psych-5.1.2-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-psych = " \
 libyaml \
 ruby-default-gems \
 rubygems \
 ruby-libs \
 glibc \
"

URI_rubygem-racc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-racc-1.7.3-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-racc = " \
 glibc \
 ruby-libs \
 rubygems \
 ruby \
"

URI_rubygem-rake = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-rake-13.1.0-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rake = " \
 rubygems \
 ruby \
"

URI_rubygem-rbs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-rbs-3.4.0-10.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-rbs = " \
 ruby \
 ruby-default-gems \
 rubygems \
 ruby-libs \
 glibc \
"

URI_rubygem-rdoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-rdoc-6.6.3.1-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rdoc = " \
 rubygem-psych \
 ruby \
 rubygems \
 rubygem-io-console \
 rubygem-json \
"

URI_rubygem-rexml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-rexml-3.3.9-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rexml = " \
 rubygems \
"

URI_rubygem-rss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-rss-0.3.1-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rss = " \
 rubygems \
 rubygem-rexml \
"

URI_rubygem-test-unit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-test-unit-3.6.1-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-test-unit = " \
 rubygems \
 rubygem-power_assert \
"

URI_rubygem-typeprof = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygem-typeprof-0.21.9-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygem-typeprof = " \
 rubygems \
 rubygem-rbs \
 ruby \
"

URI_rubygems = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygems-3.5.22-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygems = " \
 ruby-libs \
 ruby \
 rubygem-psych \
"

URI_rubygems-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rubygems-devel-3.5.22-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:rubygems-devel = " \
 rubygem-rdoc \
 rubygems \
 ruby \
 rubygem-json \
"

URI_ruby-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ruby-doc-3.3.8-10.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ruby-doc = " \
 rubygem-rdoc \
"
